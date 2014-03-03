package com.example.testactiveandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.activeandroid.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Setting setting = Setting.getSetting();

        Log.i(String.valueOf(setting.mediaDownloaded));
        setting.mediaDownloaded = 1;

        setting.save();

        Log.i(String.valueOf(setting.mediaDownloaded));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
