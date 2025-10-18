/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio_10;

/**
 *
 * @author rivar
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaAsignada;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaAsignada() {
        return cuentaAsignada;
    }

    public void setCuentaAsignada(CuentaBancaria cuentaAsignada) {
        if (this.cuentaAsignada != cuentaAsignada){
            this.cuentaAsignada = cuentaAsignada;
            
            if (cuentaAsignada != null){
                cuentaAsignada.setTitular(this);
            }
            
        }
        
        
    }

    @Override
    public String toString() {
        return String.format("Titular [Nombre: %s, DNI: %s]", nombre, dni);
    }
    
    
    
    
    
    
    
}
