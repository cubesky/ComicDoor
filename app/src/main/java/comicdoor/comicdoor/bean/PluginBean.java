package comicdoor.comicdoor.bean;

import comicdoor.comicdoor.utils.LuaUtils;

/**
 * Created by max_3 on 2016/9/10.
 */
public class PluginBean {
    private String name;
    private String version;
    private LuaUtils lua;
    public PluginBean(String name,String version,LuaUtils lua){
        this.name=name;
        this.version=version;
        this.lua=lua;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public LuaUtils getLua() {
        return lua;
    }
}
