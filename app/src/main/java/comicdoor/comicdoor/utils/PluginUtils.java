package comicdoor.comicdoor.utils;

import comicdoor.comicdoor.bean.PluginBean;

/**
 * Created by max_3 on 2016/9/10.
 */
public class PluginUtils {
    PluginBean bean;
    public PluginUtils(PluginBean bean){
        this.bean=bean;
    }
    public void getHot(){
        String str=bean.getLua().evalFunction("getHot");
    }
    public void getSearch(String search){
        String str=bean.getLua().evalFunction("Search",search);
    }
    public void getDetail(String url){
        String str=bean.getLua().evalFunction("getDetail",url);
    }
}
