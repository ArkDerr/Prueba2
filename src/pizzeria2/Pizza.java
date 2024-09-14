/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria2;

/**
 *
 * @author Cetecom
 */
public class Pizza {
    private String nombre, masa, tamanno;

    public Pizza() {
    }

    public Pizza(String nombre, String masa, String tamanno) {
        this.nombre = nombre;
        this.masa = masa;
        this.tamanno = tamanno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }
    
    
}
