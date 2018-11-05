package com.android.alejandra.ud3_activityejercicio02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final static int COD_REQUEST_EDAD=1;

    EditText etNombre;
    Button btAceptar;
    TextView tvEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=findViewById(R.id.etNombre);
        btAceptar=findViewById(R.id.btAceptar);
        tvEdad=findViewById(R.id.tvEdad);

        //código para enviar el nombre a Pantalla Saludo
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=etNombre.getText().toString();
                Log.i("miapli",nombre);

                Intent i=new Intent(MainActivity.this,PantallaSaludo.class);
                Bundle info=new Bundle();
                info.putString("NOMBRE",nombre);
                i.putExtras(info);
                //lanzo la pantalla saludo, indicando que espero respuesta
                startActivityForResult(i,COD_REQUEST_EDAD);

            }
        });
    }


    /** Método callback que será llamado cuando salgamos de la pantalla saludo automáticamente y nos
     *  proporcionará los datos de aquella pantalla saludo
     * @param requestCode  código de la petición que hemos hecho con startActivityForResult()
     * @param resultCode    resultado de la operación (RESULT_OK, o RESULT_CANCEL)
     * @param data          un intent que contendrá los datos que nos devuelve pantalla saludo.
     *                      En nuestro caso contendrá la edad, guardada como String, pues la he guardado así.
     *
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==COD_REQUEST_EDAD && resultCode==RESULT_OK){
            //recojo la edad
            String edad=data.getStringExtra("EDAD");
            //muestro en pantalla la edad
            tvEdad.setText(edad);
        }
    }
}
