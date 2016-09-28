package comicdoor.comicdoor.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import comicdoor.comicdoor.R;
import comicdoor.comicdoor.bean.PluginBean;

/**
 * Created by max_3 on 2016/9/28.
 */

public class PluginCardAdapter extends RecyclerView.Adapter<PluginCardAdapter.PluginCardViewHolder>{

    private List<PluginBean> plugin_list;
    public PluginCardAdapter(List<PluginBean> plugin_list){
        this.plugin_list=plugin_list;
    }

    @Override
    public PluginCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_plugin, parent, false);
        return new PluginCardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PluginCardViewHolder holder, int position) {
        PluginBean bean=plugin_list.get(position);
        holder.plugin_name.setText(bean.getName());
        holder.plugin_version.setText(bean.getVersion());
    }


    @Override
    public int getItemCount() {
        return plugin_list.size();
    }

    class PluginCardViewHolder extends RecyclerView.ViewHolder{
        TextView plugin_name;
        TextView plugin_version;
        PluginCardViewHolder(View itemView) {
            super(itemView);
            plugin_name= (TextView) itemView.findViewById(R.id.plugin_name);
            plugin_version= (TextView) itemView.findViewById(R.id.plugin_version);
        }
    }
}
