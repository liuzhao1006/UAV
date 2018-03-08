package com.lz.base.app;

import com.google.gson.Gson;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class GsonInstance {
    private static Gson sInstance;

    public static Gson getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (GsonInstance.class) {
            if (sInstance == null) {
                sInstance = new Gson();
            }
        }
        return sInstance;
    }
}
