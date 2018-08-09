/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.Refactoring;

/**
 *
 * @author isabe
 */
public class Proyecto {
        public Persona[] participantes;
        
        public boolean participar(Persona p){
        for(int i=0;i<participantes.length; i++){
            if(participantes[i].id==p.id)
                return true;
        }
        return false;
    }
}
