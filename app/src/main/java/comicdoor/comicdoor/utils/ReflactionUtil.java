package comicdoor.comicdoor.utils;

import java.lang.reflect.Field;

/**
 * Created by Max on 2016/8/26.
 */
public class ReflactionUtil {
    public static Field find_a_field(Class<?> refclass,String fieldname){
        try {
            return refclass.getDeclaredField(fieldname);
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    public static void set_a_field(Object instence,Field reffield,Object value){
        try {
            reffield.setAccessible(true);
            reffield.set(instence,value);
        } catch (IllegalAccessException ignored) {
        }
    }
}
