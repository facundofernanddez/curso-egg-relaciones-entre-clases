package servicio;

import entidad.Revolver;

public class RevolverService {
    
    public void llenarRevolver(Revolver revolver){
        
        revolver.setPosicionActual(Math.round(Math.random() * 6));
        revolver.setPosicionAgua(Math.round(Math.random() * 6));
        
        System.out.println("Se ha cargado el revolver para empezar el juego");
    }
    
    public boolean mojar(Revolver revolver){
        boolean result = false;
        
        if(revolver.getPosicionActual() == revolver.getPosicionAgua()){
            result =  true;
        }
        
        return result;
    }
    
    public void siguienteChorro(Revolver revolver){
        revolver.setPosicionActual(revolver.getPosicionActual() + 1);
    }
}
