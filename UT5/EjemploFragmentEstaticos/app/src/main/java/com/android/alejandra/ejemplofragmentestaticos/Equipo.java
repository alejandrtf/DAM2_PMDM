package com.android.alejandra.ejemplofragmentestaticos;

import android.graphics.drawable.Drawable;

public class Equipo {
    private String nombreEquipo;
    private Drawable escudoEquipo;
    private int puntos;

    public Equipo(String nombreEquipo, Drawable escudoEquipo, int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.escudoEquipo = escudoEquipo;
        this.puntos = puntos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Drawable getEscudoEquipo() {
        return escudoEquipo;
    }

    public void setEscudoEquipo(Drawable escudoEquipo) {
        this.escudoEquipo = escudoEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
