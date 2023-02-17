
package com.mycompany.dannacasco_examen1p2;

public class Laptop {
   private String marca,defPantalla;
   private boolean rgb;

    public Laptop() {
    }

    public Laptop(String marca, String defPantalla, boolean rgb) {
        this.marca = marca;
        this.defPantalla = defPantalla;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefPantalla() {
        return defPantalla;
    }

    public void setDefPantalla(String defPantalla) {
        this.defPantalla = defPantalla;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return super.toString()+"Laptop{" + "marca=" + marca + ", defPantalla=" + defPantalla + ", rgb=" + rgb + '}';
    }
   
}
