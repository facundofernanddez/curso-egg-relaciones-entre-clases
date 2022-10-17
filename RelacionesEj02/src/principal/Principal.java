/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.
 */
package principal;

import servicio.JuegoService;

public class Principal {

    public static void main(String[] args) {
        
        JuegoService juegoServ = new JuegoService();
        
        juegoServ.ronda();
    }
    
}
