package interfaces;

import modelos.Zapato;

import java.util.List;

public interface IDefinirPrecio {
    double precio(List<Zapato> zapatosComprados);
}
