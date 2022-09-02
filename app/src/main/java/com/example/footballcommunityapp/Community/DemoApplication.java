package com.example.footballcommunityapp.Community;

import android.app.Application;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Before using SDK components, initialize the context information and pass in ApplicationContext
        SDKInitializer.initialize(this);
        SDKInitializer.setCoordType(CoordType.BD09LL);
    }
}
