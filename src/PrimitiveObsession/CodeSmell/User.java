/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession.CodeSmell;

/**
 *
 * @author isabe
 */
public class User {
    public String url;
    
    public void setPortafolio(String url){
        if("".equals(url)){
            this.url="";
        }
        this.url=url;
    }
    
    public String getPortafolio(){
        return this.url;
    }
    
}
