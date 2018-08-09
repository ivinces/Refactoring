/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession.Refactoring;

/**
 *
 * @author isabe
 */
public class Url {
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if("".equals(url)){
            this.url="";
        }
        this.url = url;
    }
    
}
