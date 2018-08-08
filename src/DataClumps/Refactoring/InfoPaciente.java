/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Refactoring;

/**
 *
 * @author isabe
 */
public class InfoPaciente {
    public int idAtencion;
    public int idPaciente;
    public int Apellido;
    public int Nombre;
    public int Sexo;
    public int Edad;
    public Trabajo trabajo;
    
    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getApellido() {
        return Apellido;
    }

    public void setApellido(int Apellido) {
        this.Apellido = Apellido;
    }

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int Nombre) {
        this.Nombre = Nombre;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
           
}
