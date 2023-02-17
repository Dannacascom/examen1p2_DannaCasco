
package com.mycompany.dannacasco_examen1p2;


public class PCescritorio extends PC{
  private int ram,almacenamiento;
  private String tipoAlmacenamiento;
    private boolean tarjetaGrafica;

    public PCescritorio() {
        super();
    }

    public PCescritorio(int ram, int almacenamiento, String tipoAlmacenamiento, boolean tarjetaGrafica, String usuario, String direccionIp, String hostname, String mascara) {
        super(usuario, direccionIp, hostname, mascara);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        if(tipoAlmacenamiento.endsWith("HDD")||tipoAlmacenamiento.equals("SSD")){
                    this.tipoAlmacenamiento = tipoAlmacenamiento;

        }
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return super.toString()+"PCescritorio{" + "ram=" + ram + ", almacenamiento=" + almacenamiento + ", tipoAlmacenamiento=" + tipoAlmacenamiento + ", tarjetaGrafica=" + tarjetaGrafica + '}';
    }
}
