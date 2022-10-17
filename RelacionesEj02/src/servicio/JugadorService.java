package servicio;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JugadorService {
    
    RevolverService revSer = new RevolverService();
    Scanner leer = new Scanner(System.in);
    
    public List<Jugador> jugadoresLista(){
        
        System.out.println("Escriba cuantos jugadores participarán");
        int j = leer.nextInt();
        if (j > 6) j = 6;
        ArrayList<Jugador> jugadoresLista = new ArrayList();
        
        int contador = 1;
        while (contador < j + 1){
            Jugador jugador = new Jugador();
            jugadoresLista.add(jugador);
            jugador.setId(contador);
            jugador.setNombre("Jugador " + jugador.getId());
            contador++;
        }
        
        return jugadoresLista;
    }
    
    public void disparo(Revolver r, Jugador jugador){
        boolean mojar = revSer.mojar(r);
        
        if (mojar == true) {
            jugador.setMojado(true);
        }
        else {
            jugador.setMojado(false);
        }
        
        revSer.siguienteChorro(r);
    }
}
