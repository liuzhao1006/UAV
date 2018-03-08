package com.lz.base.app;

import android.app.Application;

/**
 * Created by liuzhao on 2018/3/9.
 */

public interface ApplicationAsLibrary {
    public void onCreateAsLibrary(Application application);
    public void onLowMemoryAsLibrary(Application application);
    public void onTrimMemoryAsLibrary(Application application, int level);

}
