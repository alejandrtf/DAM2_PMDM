package com.alejandra.android.ejercicio01activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etMiCuadroTexto;
    Button btMiBotonAceptar;
    Button btMiBotonLimpiar;
    Button btMostrar;
    Button btMostrar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMiCuadroTexto=findViewById(R.id.etNombre);
        btMiBotonAceptar=findViewById(R.id.btAceptar);
        btMiBotonLimpiar=findViewById(R.id.btLimpiar);
        btMostrar=findViewById(R.id.btMostrar);



        btMiBotonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saludoGenerico=getString(R.string.saludoGenerico);
                Toast.makeText(MainActivity.this,saludoGenerico+etMiCuadroTexto.getText(),Toast.LENGTH_LONG).show();
            }
        });


        btMiBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etMiCuadroTexto.setText("");
            }
        });

        btMostrar.setOnClickListener(this);

    }



    /* Método que se ejecuta al pulsar el botón ocultar*/
    public void ocultar(View v){
        etMiCuadroTexto.setVisibility(View.GONE);
    }


    /* Mëtodo que se ejecuta al pulsar cualquier botón*/
    @Override
    public void onClick(View view) {
        etMiCuadroTexto.setVisibility(View.VISIBLE);
    }
}
