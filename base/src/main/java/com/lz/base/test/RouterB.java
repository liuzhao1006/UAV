package com.lz.base.test;

import android.content.Intent;

import com.lz.base.router.RouterUri;

/**
 * Created by liuzhao on 2018/3/9.
 */

public interface RouterB {
    @RouterUri("test://host_b")
    public Intent getIntentActivityB();
}
