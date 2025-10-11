/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03_;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor1 = new Autor ("Shotaru Kaneda", "Japon");
        Autor autor2 = new Autor ("Stan Lee", "Estados Unidos");
        
        Editorial editorial1 = new Editorial ("Random Libros", "Cordoba 1945");
        Editorial editorial2 = new Editorial ("Matrix", "Buenos Aires 1999");
        
        Libro libro1 = new Libro ("Akira", "999-oxo-678", editorial1);
        libro1.setAutor(autor1);
        
        Libro libro2 = new Libro ("Dragon Ball", "100-kkk-001", editorial2);
        libro2.setAutor(autor2);
        
        System.out.println("--- Información de Libros ---");
        System.out.println("\nLibro 1:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Editorial: " + libro1.getEditorial());
        System.out.println("Autor: "+libro1.getAutor());
                
        System.out.println("\nLibro 2:");
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Editorial: " + libro2.getEditorial());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Autor: "+libro2.getAutor());
        
        
        
        
    }
    
}
