package org.example.ejemploreceptoranunciospropio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btArrancar,btParar;
    private int savePos=0;
    private ReceptorPosicionMusica receptorPosicionMusica;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btArrancar=findViewById(R.id.btArrancarServicio);
        btParar=findViewById(R.id.btPararServicio);

        btArrancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentServicioMusica=new Intent(MainActivity.this,ServicioMusica.class);
                intentServicioMusica.putExtra("posicion",savePos);
                startService(intentServicioMusica);

            }
        });

        btParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,ServicioMusica.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        receptorPosicionMusica=new ReceptorPosicionMusica();
        IntentFilter filtro=new IntentFilter();
        filtro.addAction(ServicioMusica.ACCION_REPRODUCTOR_PAUSADO);
        registerReceiver(receptorPosicionMusica,filtro);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(receptorPosicionMusica);
    }

    public class ReceptorPosicionMusica extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals(ServicioMusica.ACCION_REPRODUCTOR_PAUSADO)){
                if(intent.hasExtra("posicion")){
                    savePos=intent.getIntExtra("posicion",0);
                }else{
                    savePos=0;
                }
            }
        }
    }
}
