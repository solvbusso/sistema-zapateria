package interfaces.implementaciones;

import interfaces.IBuscar;
import modelos.Zapato;

import java.util.ArrayList;
import java.util.List;

public class BuscarImpl implements IBuscar {
    @Override
    public List<Zapato> buscarXModelo(List<Zapato> zapatos, String modelo) {
        List<Zapato> zapatosXModelo = new ArrayList<>();

        for (Zapato i : zapatos) {
            if (i.getModelo().equals(modelo)) {
                zapatosXModelo.add(i);
            }
        }
        return zapatosXModelo;
    }

    @Override
    public List<Zapato> buscarXTalle(List<Zapato> zapatos, int talle) {
        List<Zapato> zapatosXTalle = new ArrayList<>();

        for (Zapato i : zapatos) {
            if (i.getTalle() == talle) {
                zapatosXTalle.add(i);
            }
        }
        return zapatosXTalle;
    }

    @Override
    public List<Zapato> buscarXGenero(List<Zapato> zapatos, char genero) {
        List<Zapato> zapatosXGenero = new ArrayList<>();

        for (Zapato i : zapatos) {
            if (i.getGenero() == genero) {
                zapatosXGenero.add(i);
            }
        }
        return zapatosXGenero;
    }

    @Override
    public List<Zapato> buscarXPrecio(List<Zapato> zapatos, int precio) {
        List<Zapato> zapatosXPrecio = new ArrayList<>();

        for (Zapato i : zapatos) {
            if (i.getPrecio() == precio) {
                zapatosXPrecio.add(i);
            }
        }
        return zapatosXPrecio;
    }

    @Override
    public List<Zapato> buscarXColor(List<Zapato> zapatos, String color) {
        List<Zapato> zapatosXColor = new ArrayList<>();

        for (Zapato i : zapatos) {
            if (i.getColor().equals(color)) {
                zapatosXColor.add(i);
            }
        }
        return zapatosXColor;
    }
}
