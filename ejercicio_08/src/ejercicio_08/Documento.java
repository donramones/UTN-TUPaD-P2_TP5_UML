/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_08;

/**
 *
 * @author rivar
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital ("4587oihjoyh", "20-09-2023", usuario);
        
    }

  

   

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
