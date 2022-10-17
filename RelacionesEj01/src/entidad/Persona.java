package entidad;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", perro=" + perro + '}';
    }
}
