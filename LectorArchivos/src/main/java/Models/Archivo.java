package Models;

public class Archivo {
    private String nombre;
    private String tipo;
    private long tamano;

    //Constructor
    public Archivo() {
    }

    //Constructor
    public Archivo(String nombre, String tipo, long tamano) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public long getTamano() {
        return tamano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamano(long tamano) {
        this.tamano = tamano;
    }
}
