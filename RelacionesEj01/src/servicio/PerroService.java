package servicio;

import entidad.Perro;
import java.util.Scanner;

public class PerroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        System.out.println("Escriba el nombre del perro");
        String nombre = leer.next();
        
        System.out.println("Escriba la raza");
        String raza = leer.next();
        
        System.out.println("Escriba la edad");
        int edad = leer.nextInt();
        
        System.out.println("Escriba el tamaño del perro");
        String size = leer.next();
                
        return new Perro(nombre, raza, edad, size);
    }
}
