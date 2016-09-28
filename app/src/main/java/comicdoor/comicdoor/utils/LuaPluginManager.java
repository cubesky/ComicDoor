package comicdoor.comicdoor.utils;

import android.os.Environment;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import comicdoor.comicdoor.bean.PluginBean;
import comicdoor.comicdoor.values.StaticConst;

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
        File folder_plugin=new File(StaticConst.plugin_home);
        File plugins[]=folder_plugin.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".comicdoor.lua")) return true;
                return false;
            }
        });
        ArrayList<File> plugin_file= (ArrayList<File>) Arrays.asList(plugins);
        return plugin_file;
        //StaticConst plugin_home
    }
    public void loadPlugin(){
        ArrayList<File> plugin_lua=searchPlugin();
        for(File lua_file:plugin_lua){
            LuaUtils lua=new LuaUtils();
            try {
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
