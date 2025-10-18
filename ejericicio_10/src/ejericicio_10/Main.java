/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio_10;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular1 = new Titular ("Pepe Mujica", "20.716.899");
        Titular titular2 = new Titular ("Kristin Ka", "22.999.678");
        System.out.println("Titular:" + titular1);
        System.out.println("Titular"+ titular2);
        
        System.out.println("Creando cuenta Bancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria("00897600001234509756", 10000.75, "BelgranoCba", "2025-10-18");
        System.out.println("Cuenta" + cuenta1);
    }
    
}
