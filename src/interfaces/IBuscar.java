package interfaces;

import modelos.Zapato;

import java.util.List;

public interface IBuscar {
    List<Zapato> buscarXModelo(List<Zapato> zapatos, String modelo);
    List<Zapato> buscarXTalle(List<Zapato> zapatos, int talle);
    List<Zapato> buscarXGenero(List<Zapato> zapatos, char genero);
    List<Zapato> buscarXPrecio(List<Zapato> zapatos, int precio);
    List<Zapato> buscarXColor(List<Zapato> zapatos, String color);
}
