 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_09;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Sant Seiya", "Prometheus");
        Profecional profecional1 = new Profecional("Dr Hause", "Clinica medica");
        
        System.out.println("Cita medica");
        CitaMedica cita = new CitaMedica ("10-1-025", 10 30, paciente1, profecional1);
        
        
        
        
    }
    
}
