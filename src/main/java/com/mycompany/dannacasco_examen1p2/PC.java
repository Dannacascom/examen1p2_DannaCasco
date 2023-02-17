
package com.mycompany.dannacasco_examen1p2;

public class PC {
    protected String usuario,direccionIp,hostname,mascara;

    public PC() {
    }

    public PC(String usuario, String direccionIp, String hostname, String mascara) {
        this.usuario = usuario;
        this.direccionIp = direccionIp;
        this.hostname = hostname;
        this.mascara = mascara;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }
    
    public static String ping(int direccionIp){
        
    }
    
    public static String decimalToBinary(int decimal) {
    String binary = "";
    while (decimal > 0) {
        int remainder = decimal % 2;
        binary = remainder + binary;
        decimal = decimal / 2;
    }
    return binary;
}

    @Override
    public String toString() {
        return "PC{" + "usuario=" + usuario + ", direccionIp=" + direccionIp + ", hostname=" + hostname + ", mascara=" + mascara + '}';
    }
     
}
