package com.android.alejandra.ejemplofragmentestaticos;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListadoEquiposFragment.OnClickEquipoListaListener {
    public static ArrayList<Equipo> listaEquipos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
    }

    private void cargarDatos() {
        String[] nombres = getResources().getStringArray(R.array.nombre_equipo);
        int[] puntos = getResources().getIntArray(R.array.puntos_equipo);

        TypedArray objetos = getResources().obtainTypedArray(R.array.escudo_equipo);
        Drawable[] imagenes = new Drawable[objetos.length()];
        for (int i = 0; i < objetos.length(); i++) {
            imagenes[i] = objetos.getDrawable(i);
        }

        for (int i = 0; i < nombres.length; i++) {
            listaEquipos.add(new Equipo(nombres[i], imagenes[i], puntos[i]));
        }
    }


    @Override
    public void onClickEquipoLista(int posEquipo) {
        VerEquipoFragment verEquipoFragment = (VerEquipoFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentVerDetalleEquipo);
        if (verEquipoFragment != null)
            verEquipoFragment.mostrarEquipo(listaEquipos.get(posEquipo));
        else {
            //no lo encontró, un solo panel
            Intent intent = new Intent(this, VerEquipoActivity.class);
            intent.putExtra("posicion", posEquipo);
            startActivity(intent);
        }
    }
}
