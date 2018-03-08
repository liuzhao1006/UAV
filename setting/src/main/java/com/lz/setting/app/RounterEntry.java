package com.lz.setting.app;

import android.content.Context;
import android.content.Intent;

import com.lz.base.router.RounterBus;
import com.lz.base.test.RouterB;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class RounterEntry {
    public static void startActivityB(Context context) {
        Intent intent = RounterBus.getRounter(RouterB.class).getIntentActivityB();
        if (intent != null) {
            context.startActivity(intent);
        }
    }
}
