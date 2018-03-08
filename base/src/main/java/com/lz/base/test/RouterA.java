package com.lz.base.test;

import android.content.Intent;

import com.lz.base.model.Phones;
import com.lz.base.router.RounterParam;
import com.lz.base.router.RouterUri;

/**
 * Created by liuzhao on 2018/3/9.
 */

public interface RouterA {
    @RouterUri("test://host_b")
    public Intent getIntentActivityA(@RounterParam("name") String name, @RounterParam("age") int age,
                                     @RounterParam("phones") Phones phones);
}
