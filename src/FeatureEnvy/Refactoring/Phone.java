/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Refactoring;


/**
 *
 * @author isabe
 */
public class Phone {
    private String numero;
    
    Phone(String numero){
        this.numero=numero;
    }
    
    private String getCodigoArea(){
        return numero.substring(0, 3);
    }
    
    private String getPrefijo(){
        return numero.substring(3, 6);
    }
    
    private String getNumero(){
        return numero.substring(6, 10);
    }
    
    
}
