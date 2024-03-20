package DTO;

public class ArchivoDTO {

    private String nombre;
    private String ruta;
    private String tipo;

    public ArchivoDTO(String nombre, String ruta, String tipo) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
