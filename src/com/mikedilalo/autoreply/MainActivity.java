package com.mikedilalo.autoreply;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.content.Context;
import android.media.AudioManager;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Sets ringer to silent mode
        AudioManager am = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        am.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        Log.i(TAG,"Silent mode");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
