/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio_10;

/**
 *
 * @author rivar
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad (codigoClave, fechaClave);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public CuentaBancaria(Titular titular) {
        if(this.titular != titular){
            if(this.titular !=null){
                Titular antiguoTitular = this.titular;
                this.titular = null;
                antiguoTitular.setCuentaAsignada(null);
                        
            }
            this.titular = titular;
            if (titular !=null){
                titular.setCuentaAsignada(this);
            }
            
        }
        
    }
    
    
    
    
    
    
}
