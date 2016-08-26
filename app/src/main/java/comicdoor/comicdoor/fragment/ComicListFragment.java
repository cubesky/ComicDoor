package comicdoor.comicdoor.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.dinus.com.loadingdrawable.render.LoadingDrawable;
import app.dinus.com.loadingdrawable.render.shapechange.CoolWaitLoadingRenderer;
import comicdoor.comicdoor.R;
import comicdoor.comicdoor.utils.ReflactionUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComicListFragment extends Fragment {


    public ComicListFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_comic_list, container, false);

        CoolWaitLoadingRenderer.Builder loadingbuilder = new CoolWaitLoadingRenderer.Builder(view.getContext());
        CoolWaitLoadingRenderer loadingrenderer=loadingbuilder.build();
        ReflactionUtil.set_a_field(loadingrenderer,ReflactionUtil.find_a_field(loadingrenderer.getClass(),"mTopColor"), Color.CYAN);
        LoadingDrawable loadingdrawable = new LoadingDrawable(loadingrenderer);
        view.setBackgroundDrawable(loadingdrawable);
        loadingdrawable.start();

        //TODO
        return view;
    }

}
