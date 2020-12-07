package com.shlee.travel;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {
    private static final String TAG = "MusicService";
    MediaPlayer player;

    public IBinder onBind(Intent intent){
        return null;
    }

    public void onCreate(){
        Log.d(TAG, "onCreate()");

        player = MediaPlayer.create(this, R.raw.travel);
        player.setLooping(false);
    }

    public void onDestroy(){
        Log.d(TAG, "onDestroy()");
        player.stop();
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        Log.d(TAG, "onStart()");
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }
}
