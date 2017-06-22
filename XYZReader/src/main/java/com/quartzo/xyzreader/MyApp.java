package com.quartzo.xyzreader;

import android.app.Application;
import android.content.Context;

/**
 * Created by victoraldir on 26/02/2017.
 */

public class MyApp extends Application {

    public static Context sContext;

    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

}
