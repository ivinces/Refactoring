/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.CodeSmell;

/**
 *
 * @author isabe
 */
public class CrearJugador {
    public String createPlayer(TipoJugador playerType)
         { switch (playerType) {
      case TENNIS:
         return "Jugador Tennis";
      case FOOTBALL:
         return "Jugador Futbol";
      case SNOOKER:
         return "Jugador Snooker";

      default:
         throw new IllegalArgumentException("Invalid player type: "
            + playerType);
      }
   }
}
