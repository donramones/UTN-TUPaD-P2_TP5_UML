/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_07;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor1 = new Motor ("V8-Nafta","Ford-456lok");
        
        Conductor conductor1 = new Conductor ("Saitama","CHI-999");
        
        Vehiculo vehiculo1 = new Vehiculo ("OXO-1999", "Fiat-600", motor1);
        
        
        System.out.println(vehiculo1.toString());
        
        
    }
    
}
