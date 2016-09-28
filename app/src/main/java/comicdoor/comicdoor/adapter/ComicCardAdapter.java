package comicdoor.comicdoor.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import comicdoor.comicdoor.R;
import comicdoor.comicdoor.bean.ComicBean;

/**
 * Created by max_3 on 2016/9/28.
 */

public class ComicCardAdapter extends RecyclerView.Adapter<ComicCardAdapter.ComicCardViewHolder>{

    private List<ComicBean> comic_list;
    public ComicCardAdapter(List<ComicBean> comic_list){
        this.comic_list=comic_list;
    }

    @Override
    public ComicCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_comic, parent, false);
        return new ComicCardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ComicCardViewHolder holder, int position) {
        ComicBean bean=comic_list.get(position);
        holder.name.setText(bean.getName());
        holder.provider.setText(bean.getPlugin_name());
    }


    @Override
    public int getItemCount() {
        return comic_list.size();
    }

    class ComicCardViewHolder extends RecyclerView.ViewHolder{
        ImageView logo;
        TextView name;
        TextView provider;
        ComicCardViewHolder(View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.image_comic_logo);
            name = (TextView) itemView.findViewById(R.id.txt_comicname);
            provider=(TextView)itemView.findViewById(R.id.txt_provider);
        }
    }
}
