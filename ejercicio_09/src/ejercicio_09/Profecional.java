/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_09;

/**
 *
 * @author rivar
 */
public class Profecional {
    private String nombreProfesional;
    private String especialidad;

    public Profecional(String nombreProfesional, String especialidad) {
        this.nombreProfesional = nombreProfesional;
        this.especialidad = especialidad;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profecional{" + "nombreProfesional=" + nombreProfesional + ", especialidad=" + especialidad + '}';
    }
    
    
    
}
