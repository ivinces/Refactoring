/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass.CodeSmell;

import java.util.Date;

/**
 *
 * @author isabe
 */
public class Reporte {
  
    void sendReport() {
      Date nextDay = new Date(PreviousEnd.getYear(),PreviousEnd.getMonth(), PreviousEnd.getDate() + 1);
    }
}
