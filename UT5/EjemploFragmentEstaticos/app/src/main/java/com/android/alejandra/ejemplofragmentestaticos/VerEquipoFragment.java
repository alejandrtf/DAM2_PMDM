package com.android.alejandra.ejemplofragmentestaticos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
  * to handle interaction events.
 * Use the {@link VerEquipoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VerEquipoFragment extends Fragment {
    private ImageView ivEscudo;
    private TextView tvNombre,tvPuntos;

    public VerEquipoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment VerEquipoFragment.
     */

    public static VerEquipoFragment newInstance(String param1, String param2) {
        VerEquipoFragment fragment = new VerEquipoFragment();
         return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_ver_equipo, container, false);
        ivEscudo=v.findViewById(R.id.ivEscudoEquipoDetalle);
        tvNombre=v.findViewById(R.id.tvNombreEquipoDetalle);
        tvPuntos=v.findViewById(R.id.tvPuntosEquipoDetalle);
        return v;

    }

    public void mostrarEquipo(Equipo equipo){
        ivEscudo.setImageDrawable(equipo.getEscudoEquipo());
        tvNombre.setText(equipo.getNombreEquipo());
        tvPuntos.setText(String.valueOf(equipo.getPuntos()));
    }


}
