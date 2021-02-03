package ejecutores;

import interfaces.IBuscar;
import interfaces.IDefinirPrecio;
import interfaces.IPoblar;
import interfaces.implementaciones.BuscarImpl;
import interfaces.implementaciones.DefinirPrecioImpl;
import interfaces.implementaciones.PoblarImpl;
import modelos.Vendedor;
import modelos.Zapato;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblar poblarClases = new PoblarImpl();
        IBuscar buscar = new BuscarImpl();
        IDefinirPrecio definirPrecio = new DefinirPrecioImpl();

        List<Zapato> zapatos = poblarClases.poblarZapatos();
        System.out.println(zapatos);

        List<Vendedor> vendedores = poblarClases.poblarVendedores();
        System.out.println(vendedores);

        Vendedor andres = vendedores.get(0);
        andres.setCantidadVendida(10000);
        System.out.println("El salario del vendedor Andrés es de $" + andres.getSalario());

        List<Zapato> zapatosComprados = new ArrayList<>();
        zapatosComprados.add(zapatos.get(0));
        zapatosComprados.add(zapatos.get(2));
        zapatosComprados.add(zapatos.get(4));
        if (zapatosComprados.size() > 2) {
            System.out.println("Tienes descuento por tu compra mayor a 2 pares!");
        }

        double precio = definirPrecio.precio(zapatosComprados);
        System.out.println("El precio final es de $" + precio);

        List zapatosDelModelo = new ArrayList();
        zapatosDelModelo = buscar.buscarXModelo(zapatos, "Sandalia");
        System.out.println(zapatosDelModelo);

        List zapatosDelGenero = new ArrayList();
        zapatosDelGenero = buscar.buscarXGenero(zapatos, 'F');
        System.out.println(zapatosDelGenero);

        List zapatosDelTalle = new ArrayList();
        zapatosDelTalle = buscar.buscarXTalle(zapatos, 38);
        System.out.println(zapatosDelTalle);

        List zapatosDelColor = new ArrayList();
        zapatosDelColor = buscar.buscarXColor(zapatos, "Negro");
        System.out.println(zapatosDelColor);

        List zapatosDelPrecio = new ArrayList();
        zapatosDelPrecio = buscar.buscarXPrecio(zapatos, 5800);
        System.out.println(zapatosDelPrecio);

    }
}
