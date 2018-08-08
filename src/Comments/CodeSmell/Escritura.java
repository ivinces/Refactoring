/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.CodeSmell;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Escritura {
    /**
     * Este metodo obtiene el fichero y crea un BufferedWriter que tendra como parametro un FileWriter.
     * Para cada objeto Puntaje que este en el ArrayList que se tiene como parametro, se obtiene sus variables 
     * de instancias y se los separa por coma. Para diferenciar cada objeto se lo escribe en lineas diferentes.
     * @param principiante Array a iterar
     * @throws IOException tira una excepcion
     */
    public void Escritura1 (ArrayList<String> principiante) throws IOException{
        
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
    
    /**
     * Se utiliza para la escritura en el archivo intermedio.txt cuando se obtiene un nuevo Puntaje.
     * @param intermedio Array a iterar
     * @throws IOException tira una excepcion
     */
    public void Escritura2 (ArrayList<String> intermedio) throws IOException{
        
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
    
    /**
     * Se utiliza para la escritura en el archivo avanzado.txt cuando se obtiene un nuevo Puntaje.
     * @param avanzado Array a iterar
     * @throws IOException tira una excepcion
     */
    public void Escritura3 (ArrayList<String> avanzado) throws IOException{
        
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
