package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Escriba el nombre");
        String nombre = leer.next();
        
        System.out.println("Escriba el apellido");
        String apellido = leer.next();
        
        System.out.println("Escriba el dni");
        int dni = leer.nextInt();
        
        Perro perro = null;
                
        return new Persona(nombre, apellido, dni, perro);
    }
    
    public void asignarPerro(Persona persona, Perro perro){
        persona.setPerro(perro);
    }
    
    public void mostrarInfo(Persona persona){
        System.out.println(persona);
    }
}
