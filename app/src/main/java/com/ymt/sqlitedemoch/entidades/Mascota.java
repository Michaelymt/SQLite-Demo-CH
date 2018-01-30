package com.ymt.sqlitedemoch.entidades;

import java.io.Serializable;

/**
 * Created by michael on 1/29/18.
 */

public class Mascota implements Serializable {

    private Integer idDuenio;
    private Integer idMascota;
    private String nombreMascota;
    private String raza;

    public Mascota() {
    }

    public Mascota(Integer idDuenio, Integer idMascota, String nombreMascota, String raza) {
        this.idDuenio = idDuenio;
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
    }

    public Integer getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(Integer idDuenio) {
        this.idDuenio = idDuenio;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idDuenio=" + idDuenio +
                ", idMascota=" + idMascota +
                ", nombreMascota='" + nombreMascota + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
