package entidad;

import java.util.List;

public class Baraja {
    
    private List<Carta> mazo;

    public Baraja() {
    }

    public Baraja(List<Carta> mazo) {
        this.mazo = mazo;
    }

    public List<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(List<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
}
