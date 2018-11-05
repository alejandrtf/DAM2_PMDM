package com.android.alejandra.ejercicio02activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    Button btAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=findViewById(R.id.etNombre);
        btAceptar=findViewById(R.id.btAceptar);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=etNombre.getText().toString();
                Log.i("miapli",nombre);

                Intent i=new Intent(MainActivity.this,PantallaSaludo.class);
                Bundle info=new Bundle();
                info.putString("NOMBRE",nombre);
                i.putExtras(info);
                startActivity(i);

            }
        });
    }
}
