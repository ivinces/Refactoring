/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass.Refactoring;

import java.util.Date;

/**
 *
 * @author isabe
 */
public class Reporte {
    public void sendReport() {
        Date previousEnd = null;
        Date newStart = nextDay(previousEnd);
      //...
    }
    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}
