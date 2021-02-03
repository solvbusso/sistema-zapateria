package modelos;

public class Zapato {
    private String modelo;
    private int talle;
    private char genero;
    private String color;
    private int precio;

    public Zapato(String modelo, int talle, char genero, String color, int precio) {
        this.modelo = modelo;
        this.talle = talle;
        this.genero = genero;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "modelo='" + modelo + '\'' +
                ", talle=" + talle +
                ", genero=" + genero +
                ", color='" + color + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
