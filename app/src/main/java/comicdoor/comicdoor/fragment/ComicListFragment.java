package comicdoor.comicdoor.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuesda.walker.circlerefresh.CircleRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import app.dinus.com.loadingdrawable.render.LoadingDrawable;
import app.dinus.com.loadingdrawable.render.shapechange.CoolWaitLoadingRenderer;
import comicdoor.comicdoor.R;
import comicdoor.comicdoor.adapter.ComicCardAdapter;
import comicdoor.comicdoor.bean.ComicBean;
import comicdoor.comicdoor.utils.ReflactionUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComicListFragment extends Fragment {

    private List<ComicBean> comic_list = new ArrayList<>();
    private Handler handler;
    public ComicListFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_comic_list, container, false);

        CoolWaitLoadingRenderer.Builder loadingbuilder = new CoolWaitLoadingRenderer.Builder(view.getContext());
        CoolWaitLoadingRenderer loadingrenderer=loadingbuilder.build();
        ReflactionUtil.set_a_field(loadingrenderer,ReflactionUtil.find_a_field(loadingrenderer.getClass(),"mTopColor"), Color.CYAN);
        final LoadingDrawable loadingdrawable = new LoadingDrawable(loadingrenderer);
        view.setBackgroundDrawable(loadingdrawable);
        loadingdrawable.start();

        final CircleRefreshLayout pullToRefreshView=(CircleRefreshLayout)view.findViewById(R.id.pull_to_refresh) ;
        pullToRefreshView.setOnRefreshListener(new CircleRefreshLayout.OnCircleRefreshListener() {
            @Override
            public void completeRefresh() {

            }

            @Override
            public void refreshing() {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        handler.sendEmptyMessage(1);
                    }
                }).start();
            }
        });

        RecyclerView recycler_comic_list = (RecyclerView) view.findViewById(R.id.recycler_comic_list);
        final ComicCardAdapter comicCardAdapter=new ComicCardAdapter(comic_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(), 4);

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return 1;
            }
        });
        recycler_comic_list.setLayoutManager(gridLayoutManager);
        recycler_comic_list.setItemAnimator(new DefaultItemAnimator());
        recycler_comic_list.setAdapter(comicCardAdapter);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.sendEmptyMessage(0);
            }
        }).start();

        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what){
                    case 0:
                        loadingdrawable.stop();
                        view.setBackgroundColor(Color.WHITE);
                        for(int i=0;i<=30;i++){
                            comic_list.add(new ComicBean("虚漫画","["+String.valueOf(i)+"]",""));
                        }
                        comicCardAdapter.notifyDataSetChanged();
                        break;
                    case 1:
                        pullToRefreshView.finishRefreshing();
                        break;
                }
            }
        };

        //TODO
        return view;
    }

}
