package comicdoor.comicdoor.values;

import android.os.Environment;

import java.io.File;

/**
 * Created by max_3 on 2016/9/10.
 */
public class StaticConst {
    public final static String plugin_home= Environment.getExternalStorageDirectory().getAbsolutePath()+ File.pathSeparator+"ComicDoor"+File.pathSeparator+"plugin";
}
