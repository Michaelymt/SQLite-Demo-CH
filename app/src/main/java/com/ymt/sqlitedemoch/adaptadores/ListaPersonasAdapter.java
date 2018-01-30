package com.ymt.sqlitedemoch.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ymt.sqlitedemoch.R;
import com.ymt.sqlitedemoch.entidades.Usuario;

import java.util.ArrayList;

/**
 * Created by michael on 1/29/18.
 */

public class ListaPersonasAdapter extends RecyclerView.Adapter<ListaPersonasAdapter.ViewHolder> {

    ArrayList<Usuario> listaUsuario;

    public ListaPersonasAdapter(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personas, null, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.documento.setText(listaUsuario.get(position).getId().toString());
        holder.nombre.setText(listaUsuario.get(position).getNombre());
        holder.telefono.setText(listaUsuario.get(position).getTelefono());
    }

    @Override
    public int getItemCount() {
        return listaUsuario.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView documento, nombre, telefono;

        public ViewHolder(View itemView) {
            super(itemView);
            documento=(TextView) itemView.findViewById(R.id.textDocumento);
            nombre=(TextView) itemView.findViewById(R.id.textNombre);
            telefono=(TextView) itemView.findViewById(R.id.textTelefono);
        }
    }
}
