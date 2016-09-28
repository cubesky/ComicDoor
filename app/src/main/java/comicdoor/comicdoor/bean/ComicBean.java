package comicdoor.comicdoor.bean;

import comicdoor.comicdoor.utils.LuaUtils;

/**
 * Created by max_3 on 2016/9/10.
 */
public class ComicBean {
    private String name;
    private String plugin_name;
    private String logo_url;
    public ComicBean(String name, String plugin_name, String logo_url){
        this.name=name;
        this.plugin_name=plugin_name;
        this.logo_url=logo_url;
    }

    public String getPlugin_name() {
        return plugin_name;
    }

    public String getName() {
        return name;
    }

    public String getLogo_url() {
        return logo_url;
    }
}
