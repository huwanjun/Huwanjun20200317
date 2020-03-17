package com.bw.huwanjun;

import android.app.Application;
import android.content.Context;

/**
 * author: 斛万珺
 * data: 2020/3/17 08:8:58
 * function:
 */
public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
