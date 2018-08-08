/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.CodeSmell;

/**
 *
 * @author isabe
 */
public class Precio {
    int cantidad;
    float precio;
    
    public double obtenerPrecio(){
        double preciobase= cantidad*precio;
        if(preciobase>1000)
            return (preciobase*0.95);
        else
            return (preciobase*0.98);
        
    }
}
