package comicdoor.comicdoor.fragment;

import android.support.v4.app.Fragment;

/**
 * Created by Max on 2016/8/26.
 */
public class FragmentChangeHelper {
    //Create Fragment
    public static Fragment newInstence(int id){
        switch (id){
            case 0:
                return new ComicListFragment();
            case 1:
                return new SearchFragment();
            case 2:
                return new DownloadFragment();
            case 3:
                return new PluginFragment();
            case 4:
                return new SettingFragment();
            default:
                return null;
        }
    }

    //Setup Actionbar
    public static void setupActionBar(){

    }
}
