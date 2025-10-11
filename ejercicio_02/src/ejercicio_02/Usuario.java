/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02;

/**
 *
 * @author rivar
 */
public class Usuario {
    private String dni;
    private String nombre;
    private Celular celular;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        String infoCelular = (this.celular != null) ? this.celular.getMarca() + " " + this.celular.getModelo() : "Sin asignar";
        return "Usuario{" + "dni=" + dni + ", nombre=" + nombre + ", celular=" + celular + infoCelular +"}";
    }
    
    
   
    
}
