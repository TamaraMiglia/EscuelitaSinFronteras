/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltadeAlumnos;

/**
 *
 * @author pc
 */
public class Alumnos {
    
String Nombre;
String Apellido;
int Dni;
String Carrera;

public Alumnos (String Nombre, String Apellido, int Dni, String Carrera){
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.Dni = Dni;
    this.Carrera = Carrera;
    
            
}

    public Alumnos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    
}
