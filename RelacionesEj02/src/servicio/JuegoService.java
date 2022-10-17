package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.List;

public class JuegoService {
    
    Juego juego = new Juego();
    JugadorService servJugador = new JugadorService();
    RevolverService servRevolver = new RevolverService();
    
    public void llenarJuego(List<Jugador> jugadores, Revolver r){
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
        System.out.println("Ya estan listos los participantes");
    }
    
    public void ronda(){
        Revolver r = new Revolver();
        this.llenarJuego(servJugador.jugadoresLista(), r);
        servRevolver.llenarRevolver(juego.getRevolver());
        
        List<Jugador> jugadores = juego.getJugadores();
        Revolver revolver = juego.getRevolver();
        
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("RONDA " + (i + 1));
            servJugador.disparo(revolver, jugadores.get(i));
            
            if(jugadores.get(i).isMojado() == true){
                System.out.println("Se ha mojado el jugador " + jugadores.get(i).getNombre() + ", el juego terminó.");
                break;
            } else if (jugadores.get(jugadores.size() - 1).isMojado() == false && i == jugadores.size() - 1) {
                jugadores.get(jugadores.size() - 1).setMojado(true);
                System.out.println("Se ha mojado " + jugadores.get(jugadores.size() - 1).getNombre() + ". El juego terminó.");
                break;
            } else if (jugadores.get(i).isMojado() == false) {
                System.out.println("El jugador " + jugadores.get(i).getNombre() + " se ha salvado, el juego continua");
            }
        }
    }
}
