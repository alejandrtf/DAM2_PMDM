package com.android.alejandra.ejemplofragmentestaticos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListadoEquiposFragment.OnClickEquipoListaListener} interface
 * to handle interaction events.
 * Use the {@link ListadoEquiposFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListadoEquiposFragment extends Fragment {

    private OnClickEquipoListaListener mListener;
    private RecyclerView recyclerViewListadoEquipos;

    public ListadoEquiposFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ListadoEquiposFragment.
     */

    public static ListadoEquiposFragment newInstance() {
        ListadoEquiposFragment fragment = new ListadoEquiposFragment();
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
        View v= inflater.inflate(R.layout.fragment_listado_equipos, container, false);
        if(v instanceof RecyclerView) {
            Context context=v.getContext();
            recyclerViewListadoEquipos=(RecyclerView)v;
            recyclerViewListadoEquipos.setLayoutManager(new LinearLayoutManager(context));
            return recyclerViewListadoEquipos;
        }

   return null;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AdaptadorEquiposRecyclerView adaptadorEquiposRecyclerView=new AdaptadorEquiposRecyclerView(MainActivity.listaEquipos);

       adaptadorEquiposRecyclerView.setMiEscuchadorClick(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(mListener!=null){
                   mListener.onClickEquipoLista(recyclerViewListadoEquipos.getChildAdapterPosition(view));
               }
           }
       });
        recyclerViewListadoEquipos.setAdapter(adaptadorEquiposRecyclerView);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnClickEquipoListaListener) {
            mListener = (OnClickEquipoListaListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnClickEquipoListaListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnClickEquipoListaListener {
        void onClickEquipoLista(int posEquipo);
    }
}
