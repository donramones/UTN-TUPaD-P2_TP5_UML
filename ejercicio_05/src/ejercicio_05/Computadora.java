/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_05;

/**
 *
 * @author rivar
 */
public class Computadora {
    private String marca;
    private String numeroDeSerie;
    private PlacaMadre placamadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroDeSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
        this.placamadre = new PlacaMadre(modelo, chipset);
    }

    public Computadora(String marca, String numeroDeSerie, String modelo, String chipset, Propietario propietario) {
        this(marca, numeroDeSerie, modelo, chipset);
        if(propietario != null){
            this.propietario = propietario;
            propietario.setComputadora(this);
        }
        
        
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora()!= this){
            propietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public PlacaMadre getPlacamadre() {
        return placamadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroDeSerie=" + numeroDeSerie + ", placamadre=" + placamadre + ", propietario=" + propietario + '}';
    }
    
    
    
    
    
    
    
    
    
    

  
    
    
    
}
