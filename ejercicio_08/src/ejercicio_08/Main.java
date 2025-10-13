/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_08;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario ("Lord Voldemort","lorvolder@abracadabra.com");
        Documento documento1 = new Documento ("Magia Blanca","contenido de la magic", usuario1);
        
        
        System.out.println(documento1);
        
   
        
        
        
    }
    
}
