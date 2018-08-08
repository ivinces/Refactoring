/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.Refactoring;


/**
 *
 * @author isabe
 */
public class Precio {
    int cantidad;
    float precio;
    
    public double obtenerPrecio(){
        if(ObtenerBase()>1000)
            return (ObtenerBase()*0.95);
        else
            return (ObtenerBase()*0.98);
        
    }
    
    public double ObtenerBase(){
        return cantidad*precio;
    }
}
