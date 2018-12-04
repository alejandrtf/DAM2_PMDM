package org.example.ejemploreceptoranunciospropio;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;

public class ServicioMusica extends Service {
    public static final String ACCION_REPRODUCTOR_PAUSADO="org.example.ejemploreceptoranunciospropio.intent.action.ACCION_REPRODUCTOR_PAUSADO";
    private MediaPlayer mp;
    private int pos;

    @Override
    public void onCreate() {
        super.onCreate();
        mp = MediaPlayer.create(this, R.raw.audio);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent.hasExtra("posicion"))
            pos = intent.getIntExtra("posicion", 0);
        mp.seekTo(pos);
        mp.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        if(mp!=null && mp.isPlaying())
            mp.pause();
        pos=mp.getCurrentPosition();

        Intent intent=new Intent();
        intent.setAction(ACCION_REPRODUCTOR_PAUSADO);
        intent.putExtra("posicion",pos);
        sendBroadcast(intent);

        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
