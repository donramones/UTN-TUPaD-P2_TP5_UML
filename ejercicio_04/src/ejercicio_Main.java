/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rivar
 */
public class ejercicio_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco bancoHBC = new Banco("Banco HBC", "40-90089000-5");
        Cliente clienteA = new Cliente("Tetsuo Shima", "44.789.678");
        Cliente clienteB = new Cliente("Shotaru Kaneda", "32.123.987");
        
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito ("4589-1234-9999-8016", "11/29", bancoHBC);
        clienteA.setTarjeta(tarjeta1);
        
        System.out.println("\nDatos Tarjeta de Credito");
        System.out.println(tarjeta1.getCliente() + " tiene tarjeta con vencimiento " + tarjeta1.getFechaVencimiento());
        System.out.println("La Tarjeta pertenece a: " + tarjeta1.getBanco());
       
        
    }
    
}
