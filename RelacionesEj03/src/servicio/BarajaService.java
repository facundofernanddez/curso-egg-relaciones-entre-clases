package servicio;

import entidad.Carta;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void barajar(List<Carta> mazo){
        Collections.shuffle(mazo);
    }
    
    public Carta siguienteCarta(List<Carta> mazo){
        Carta carta = null;
        
        for (Carta i : mazo){
            if (i != null) carta = i;
        }
        
        return carta;
    }
    
    public void cartasDisponibles(List<Carta> mazo){
        int numero = 0;
        
        for (Carta i : mazo){
            if (i != null) numero++;
        }
        
        System.out.println("El número de cartas disponibles es: " + numero);
    }
    
    public void darCartas(List<Carta> mazo){
        System.out.println("Cuantas cartas hay que repartir?");
        int j = leer.nextInt();
        
        while (j > 40){
            System.out.println("El numero especificado es mayor al numero total de cartas. Pruebe de nuevo con un numero mas chico");
            j = leer.nextInt();
        }
        
        for (int i = 0; i < j; i++) {
            Carta carta = mazo.get(i);
            carta = null;
        }
    }
}
