package com.android.alejandra.ejemplofragmentestaticos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorEquiposRecyclerView
        extends RecyclerView.Adapter<AdaptadorEquiposRecyclerView.ViewHolder> {
   private List<Equipo>listaEquipos;
   private View.OnClickListener onClickListener;


    public AdaptadorEquiposRecyclerView(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    @NonNull
    @Override
    public AdaptadorEquiposRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista_equipos,parent,false);
        v.setOnClickListener(onClickListener);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorEquiposRecyclerView.ViewHolder holder, int position) {
        Equipo equipo=listaEquipos.get(position);
        holder.bindEquipo(equipo);
    }

    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }


    public void setMiEscuchadorClick(View.OnClickListener mListener) {
        this.onClickListener = mListener;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView escudo;
        TextView nombreEquipo,puntosEquipo;

        public ViewHolder(View itemView) {
            super(itemView);

            escudo=itemView.findViewById(R.id.ivEscudo);
            nombreEquipo=itemView.findViewById(R.id.tvNombreEquipo);
            puntosEquipo=itemView.findViewById(R.id.tvPuntos);
        }

        public void bindEquipo(Equipo equipo){
            escudo.setImageDrawable(equipo.getEscudoEquipo());
            nombreEquipo.setText(equipo.getNombreEquipo());
            puntosEquipo.setText(String.valueOf(equipo.getPuntos()));
        }


    }
}
