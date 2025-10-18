/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_09;

/**
 *
 * @author rivar
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Profecional profecional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora, Profecional profecional, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.profecional = profecional;
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Profecional getProfecional() {
        return profecional;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
    
    
}
