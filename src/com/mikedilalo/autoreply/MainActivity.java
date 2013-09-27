package com.mikedilalo.autoreply;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.widget.ToggleButton;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


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
    
    public void onMainToggleClicked(View view) {
    	
    	// Is AutoReply enabled?
    	boolean on = ((ToggleButton) view).isChecked();
    	
    	if (on) {
    		// Creates SMSMonitorService intent
    	    Intent SMSMonitorIntent = new Intent(this, SMSMonitorService.class);
    		// Start SMSMonitorService
    		startService(SMSMonitorIntent);
    		Log.i(TAG,"SMSMonitor Started");
    		
    	} else {
    		// Creates SMSMonitorService intent
    	    Intent SMSMonitorIntent = new Intent(this, SMSMonitorService.class);
    		// Start SMSMonitorService
    		stopService(SMSMonitorIntent);
    		Log.i(TAG,"SMSMonitor Stopped");
    	}
    }
    
}
