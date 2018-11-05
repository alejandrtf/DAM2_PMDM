package com.android.alejandra.ud3_activityejercicio02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PantallaSaludo extends AppCompatActivity {
    TextView tvSaludo;
    Button btAceptar;
    EditText etEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_saludo);

        tvSaludo=findViewById(R.id.tvTextoSaludo);
        btAceptar=findViewById(R.id.btAceptar);
        etEdad=findViewById(R.id.etEdad);

        //código para saludar
        String nombre=getNombreFromMainActivity();
        tvSaludo.setText("Hola "+nombre);

        //código para enviar la edad al MainActivity de vuelta
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recojo la edad
                String edad=etEdad.getText().toString();
                //preparo un intent para ser devuelve al MainActivity y que contenga esa edad
                Intent intent=new Intent();
                intent.putExtra("EDAD",edad);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }




    /** Método que recoge la información que viene en el intent desde MainActivity y devuelve el
     *  nombre que se recibió.
     * @return  el nombre recibido desde MainActivity
     */
    public String getNombreFromMainActivity() {
        //accedo al intent y extraigo el bundle con la información
        Bundle info=getIntent().getExtras();
        //extraigo el nombre del bundle
        String nombre=info.getString("NOMBRE");
        return nombre;
    }
}
