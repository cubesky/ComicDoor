package comicdoor.comicdoor.utils;

import org.apache.commons.io.IOUtils;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by max_3 on 2016/9/10.
 */
public class LuaUtils {
    LuaState L;
    public LuaUtils(){
        L= LuaStateFactory.newLuaState();
        L.openLibs();
    }


    public void loadLua(File file) throws IOException {
        InputStream in = new FileInputStream(file);
        L.LdoString(IOUtils.toString(in, "UTF-8"));
    }

    public String evalFunction(String function,String pushed){
        L.getGlobal(function);
        L.pushString(pushed);
        L.pcall(1,1,0);
        return L.toString(-1);
    }

    public String evalFunction(String function){
        L.getGlobal(function);
        L.pcall(0,1,0);
        return L.toString(-1);
    }
}
