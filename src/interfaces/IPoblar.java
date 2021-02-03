package interfaces;

import modelos.Vendedor;
import modelos.Zapato;

import java.util.List;

public interface IPoblar {
    List<Zapato> poblarZapatos();
    List<Vendedor> poblarVendedores();
}
