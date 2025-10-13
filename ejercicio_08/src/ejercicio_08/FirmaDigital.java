/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_08;

/**
 *
 * @author rivar
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    FirmaDigital(String oihjoyh, String string, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        String infoUsuario = (usuario != null) ? usuario.getNombre() : "Sim usuario";
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + infoUsuario + '}';
    }
    
    
    
}
