/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_06;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("Naruto Uzumaki","389-333-9876");
        Cliente cliente2 = new Cliente ("Dan Kato","453-234-099");
        
        Mesa mesa1 = new Mesa ("02-B",4);
        Mesa mesa2 = new Mesa ("01-A",2);
        
        System.out.println("\n--- Reservas ---");
        System.out.println(cliente1.toString());
        System.out.println(mesa1.toString());
        
        
    }
    
}
