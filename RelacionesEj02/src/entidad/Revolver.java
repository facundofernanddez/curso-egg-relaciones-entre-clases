package entidad;

public class Revolver {
    
    private double posicionActual;
    private double posicionAgua;

    public Revolver() {
    }

    public Revolver(double posicionActual, double posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public double getPosicionActual() {
        return posicionActual;
    }

    public double getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionActual(double posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(double posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
}
