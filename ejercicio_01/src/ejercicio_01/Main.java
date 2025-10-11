/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("30.123.999", "Atomic Samurai");
        Pasaporte pasaporte = new Pasaporte("CHI98765XYZ", "30-09-2025", "/img/foto_pasaporte_samu.jpg", "JPG");
        
        pasaporte.setTitular(titular);
        
        System.out.println("Titular: " + titular.getNombre() + " - Pasaporte Nº: " + titular.getPasaporte().getNumero());
        System.out.println("Foto formato: " + pasaporte.getFoto().getFormato());
        
    }
    
}
