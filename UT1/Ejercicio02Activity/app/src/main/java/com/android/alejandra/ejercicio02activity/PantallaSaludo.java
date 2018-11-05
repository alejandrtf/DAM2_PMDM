package com.android.alejandra.ejercicio02activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PantallaSaludo extends AppCompatActivity {
    TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_saludo);

        tvSaludo=findViewById(R.id.tvTextoSaludo);

        Bundle info=getIntent().getExtras();
        String nombre=info.getString("NOMBRE");

        tvSaludo.setText("Hola "+nombre);
    }
}
