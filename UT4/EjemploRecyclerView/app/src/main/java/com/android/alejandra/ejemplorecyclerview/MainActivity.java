package com.android.alejandra.ejemplorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class
MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private List<Usuario> listaUsuarios;
private AdaptadorUsuarios adaptadorUsuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatosEjemplo();

        //inicializar recyclerview
        recyclerView=findViewById(R.id.rvListaUsuarios);
        adaptadorUsuarios=new AdaptadorUsuarios(listaUsuarios);
        adaptadorUsuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Has pulsado el elemento en la posición: "+
                        recyclerView.getChildAdapterPosition(view), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adaptadorUsuarios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }

    private void initDatosEjemplo() {
        listaUsuarios=new ArrayList<>();
        for(int i=0;i<15; i++){
            listaUsuarios.add(new Usuario("Nombre "+i, "Apellidos "+i, "Dirección "+i,0,0,0));
        }
    }
}
