/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Refactoring;

/**
 *
 * @author isabe
 */
public enum TipoJugador {
    TENNIS {
   public String createPlayer() {
      return "Jugador Tenis";
   }
    },
    FOOTBALL {
       public String createPlayer() {
          return "JUgador football";
       }
    },
    SNOOKER {
          public String createPlayer() {
             return "Jugador Snooker";
          }
       };

}
