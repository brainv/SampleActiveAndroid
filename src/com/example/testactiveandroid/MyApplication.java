package com.example.testactiveandroid;

import android.app.Application;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

public class MyApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();

    Configuration.Builder config = new Configuration.Builder(this);
    config.addModelClasses(Setting.class);
    ActiveAndroid.initialize(config.create());
  }
}