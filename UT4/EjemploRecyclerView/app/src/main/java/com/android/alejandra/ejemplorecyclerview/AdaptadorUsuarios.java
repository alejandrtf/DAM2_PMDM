package com.android.alejandra.ejemplorecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.UsuariosViewHolder> {
    private List<Usuario> listaUsuarios;
    private View.OnClickListener listener;


    public AdaptadorUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public UsuariosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        itemView.setOnClickListener(listener);
        UsuariosViewHolder usuariosViewHolder=new UsuariosViewHolder(itemView);
        return usuariosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsuariosViewHolder holder, int position) {
            Usuario usuario=listaUsuarios.get(position);
            holder.bindUsuario(usuario);
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }




    /**
     * VIEWHOLDER
     */
    public static class UsuariosViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombre, tvApellidos, tvDireccion;

        public UsuariosViewHolder(View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvApellidos = itemView.findViewById(R.id.tvApellidos);
            tvDireccion = itemView.findViewById(R.id.tvDireccion);
        }


        public void bindUsuario(Usuario usuario) {
            tvNombre.setText(usuario.getNombre());
            tvApellidos.setText(usuario.getApellidos());
            tvDireccion.setText(usuario.getDirección());
        }
    }
}
