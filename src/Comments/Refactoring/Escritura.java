/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Refactoring;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author isabe
 */
public class Escritura {
    /**
     * Los metodos de esta clase serviran para escribir los diferentes ficheros.
     */
    public void EscrituraPrincipiante (ArrayList<String> principiante) throws IOException{
        
        String ruta = "Principiante.txt";
        File archivo = new File(ruta);
        if (archivo.exists()){
        BufferedWriter bw= new BufferedWriter(new FileWriter(ruta));
        
        for(String R : principiante){
            String linea = R;
            bw.append(linea);
            bw.append("\n");
        }
        bw.close();
        }
       
    
    }
    
    
    public void EscrituraIntermedio (ArrayList<String> intermedio) throws IOException{
        
        String ruta = "Intermedio.txt";
        File archivo = new File(ruta);
        if (archivo.exists()){
        BufferedWriter bw= new BufferedWriter(new FileWriter(ruta));
        
        for(String R : intermedio){
            String linea = R;
            bw.append(linea);
            bw.append("\n");
        }
        bw.close();
        }
    
    }
   
    public void EscrituraAvanzado (ArrayList<String> avanzado) throws IOException{
        
        String ruta = "Avanzado.txt";
        File archivo = new File(ruta);
        if (archivo.exists()){
        BufferedWriter bw= new BufferedWriter(new FileWriter(ruta));
        
        for(String R : avanzado){
            String linea = R;
            bw.append(linea);
            bw.append("\n");
        }
        bw.close();
        }
    
    }
}
