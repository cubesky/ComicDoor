package comicdoor.comicdoor.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import comicdoor.comicdoor.R;
import comicdoor.comicdoor.adapter.PluginCardAdapter;
import comicdoor.comicdoor.bean.PluginBean;

/**
 * A simple {@link Fragment} subclass.
 */
public class PluginFragment extends Fragment {

    private List<PluginBean> plugin_list = new ArrayList<>();
    public PluginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_plugin, container, false);
        RecyclerView recycler_plugin_view = (RecyclerView) view.findViewById(R.id.recycler_plugin);
        PluginCardAdapter pluginCardAdapter=new PluginCardAdapter(plugin_list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(view.getContext());
        recycler_plugin_view.setLayoutManager(mLayoutManager);
        recycler_plugin_view.setItemAnimator(new DefaultItemAnimator());
        recycler_plugin_view.setAdapter(pluginCardAdapter);

        for(int i=0;i<=30;i++)
            plugin_list.add(new PluginBean("虚插件","["+String.valueOf(i)+"]",null));

        pluginCardAdapter.notifyDataSetChanged();

        return view;
    }

}
