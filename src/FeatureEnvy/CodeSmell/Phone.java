/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.CodeSmell;

/**
 *
 * @author isabe
 */
public class Phone {
    private String numero;
    
    Phone(String numero){
        this.numero=numero;
    }
    
    public String getCodigoArea(){
        return numero.substring(0, 3);
    }
    
    public String getPrefijo(){
        return numero.substring(3, 6);
    }
    
    public String getNumero(){
        return numero.substring(6, 10);
    }
    
    public String getMobileNumero(Phone mobile){
        return "("+mobile.getCodigoArea()+")"+mobile.getPrefijo()+
                "-"+mobile.getNumero();
    }
}
