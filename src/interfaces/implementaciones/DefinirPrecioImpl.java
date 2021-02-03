package interfaces.implementaciones;

import interfaces.IDefinirPrecio;
import modelos.Vendedor;
import modelos.Zapato;

import java.util.ArrayList;
import java.util.List;

public class DefinirPrecioImpl implements IDefinirPrecio {


    @Override
    public double precio(List<Zapato> zapatosComprados) {
        double precioFinal = 0;

        for (Zapato i : zapatosComprados) {
            if (zapatosComprados.size() > 2) {
                precioFinal = i.getPrecio() * 0.8;
            } else {
                precioFinal = i.getPrecio();
            }
        }
        return precioFinal;
    }
}
