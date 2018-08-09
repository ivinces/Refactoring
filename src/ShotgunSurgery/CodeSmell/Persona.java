/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.CodeSmell;

/**
 *
 * @author isabe
 */
public class Persona {
    int id;
    
    public boolean participar(Proyecto p){
        for(int i=0;i<p.participantes.length; i++){
            if(p.participantes[i].id==id)
                return true;
        }
        return false;
    }
}
