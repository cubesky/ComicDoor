package comicdoor.comicdoor.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import comicdoor.comicdoor.bean.PluginBean;

/**
 * Created by max_3 on 2016/9/10.
 */
public class LuaPluginManager {
    private static LuaPluginManager instance = null;
    private HashMap<String,PluginBean> plugin_instance = new HashMap<>();
    private static ArrayList<File> plugin_library = new ArrayList<>();
    private LuaPluginManager(){

    }
    public static LuaPluginManager getInstance(){
        if(instance==null){
            instance = new LuaPluginManager();
        }
        return instance;
    }
    public void evalPlugin(String plugin,String function,String value){

    }
    private ArrayList<File> searchPlugin(){
        return null;
        //StaticConst plugin_home
    }
    private static void searchLibrary(){
        //search library
    }
    public void loadPlugin(){
        ArrayList<File> plugin_lua=searchPlugin();
        for(File lua_file:plugin_lua){
            LuaUtils lua=new LuaUtils();
            try {
                for(File lib:plugin_library){
                    lua.loadLua(lib);
                }
                lua.loadLua(lua_file);
                String name=lua.evalFunction("getName");
                String version=lua.evalFunction("getVersion");
                PluginBean bean=new PluginBean(name,version,lua);
                plugin_instance.put(name,bean);
            } catch (IOException ignore) {
            }
        }
    }
}
