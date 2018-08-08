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
public class Customer {
    private Phone mobile;
    
    public String getMobileNumero(){
        return "("+mobile.getCodigoArea()+")"+mobile.getPrefijo()+
                "-"+mobile.getNumero();
    }
}
