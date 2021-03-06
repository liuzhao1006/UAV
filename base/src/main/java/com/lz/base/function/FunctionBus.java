package com.lz.base.function;

import android.widget.Toast;

import com.lz.base.app.AppContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class FunctionBus {
    /**
     * 方法总线，缓存的map
     */
    public static Map<Class, Object> sFunctionClassMap = new HashMap<>();

    /**
     * 设置方法接口的实现
     * @param o
     */
    public static void setFunction(Object o) {
        Class[] interfaces = o.getClass().getInterfaces();
        for (Class c : interfaces) {
            if (sFunctionClassMap.containsKey(c)) {
                throw new IllegalStateException("duplicate set function:" + c.getName());
            }
            sFunctionClassMap.put(c, o);
        }
    }

    /**
     * 获取方法的实现类
     * @param c
     * @param <T>
     * @return
     */
    public static<T> T getFunction(Class<T> c) {
        T f = (T) sFunctionClassMap.get(c);
        if (f == null) {
            Toast.makeText(AppContext.get(), "you have not register function:" + c.getName(), Toast.LENGTH_SHORT).show();
            return null;
        }
        return f;
    }
}
