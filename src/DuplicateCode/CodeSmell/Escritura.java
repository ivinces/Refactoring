/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.CodeSmell;

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
    public void EscrituraPrincipiante (ArrayList<String> principiante, String texto) throws IOException{

        File archivo = new File(texto);
        if (archivo.exists()){
        BufferedWriter bw= new BufferedWriter(new FileWriter(texto));
        
        for(String R : principiante){
            String linea = R;
            bw.append(linea);
            bw.append("\n");
        }
        bw.close();
        }
    
    }
    
}
