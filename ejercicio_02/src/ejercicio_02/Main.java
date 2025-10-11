/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bateria = new Bateria("XOXO-5000", "5000mAh");
        
        Usuario usuario = new Usuario ("28.789.99", "Saitama one ");
        
        Celular celular = new Celular ("3517892347", "Xiaomi", "Note 14", bateria);
        
        celular.setUsuario(usuario);
        
        System.out.println(celular);
        System.out.println();
        System.out.println(usuario);
        System.out.println();
          
    }
    
}
