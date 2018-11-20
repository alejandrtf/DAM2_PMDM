package com.android.alejandra.ejemplofragmentestaticos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VerEquipoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_equipo);

        int pos=getIntent().getIntExtra("posicion",0);

        VerEquipoFragment verEquipoFragment= (VerEquipoFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentVerDetalleEquipo);
        if(verEquipoFragment!=null)
            verEquipoFragment.mostrarEquipo(MainActivity.listaEquipos.get(pos));
    }
}
