package com.quartzo.xyzreader;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * Created by victoraldir on 26/02/2017.
 */

public class MyApp extends Application {

    public static Context sContext;

    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }

        sContext = getApplicationContext();
    }

}
