package interfaces.implementaciones;

import interfaces.IPoblar;
import modelos.Vendedor;
import modelos.Zapato;

import java.util.ArrayList;
import java.util.List;

public class PoblarImpl implements IPoblar {

    @Override
    public List<Zapato> poblarZapatos() {
        List<Zapato> zapatos = new ArrayList<>();

        Zapato z1 = new Zapato("Zapato",38,'F',"Negro",3000);
        Zapato z2 = new Zapato("Sandalia",38,'F',"Blanco",2500);
        Zapato z3 = new Zapato("Zapato",36,'M',"Negro",5300);
        Zapato z4 = new Zapato("Zapatilla",37,'F',"Marron",1650);
        Zapato z5 = new Zapato("Sandalia",35,'F',"Negro",5800);
        Zapato z6 = new Zapato("Zapato",37,'M',"Blanco",4200);
        Zapato z7 = new Zapato("Zapato",38,'M',"Negro",2550);

        zapatos.add(z1);
        zapatos.add(z2);
        zapatos.add(z3);
        zapatos.add(z4);
        zapatos.add(z5);
        zapatos.add(z6);
        zapatos.add(z7);

        return zapatos;
    }

    @Override
    public List<Vendedor> poblarVendedores() {
        List<Vendedor> vendedores = new ArrayList<>();

        Vendedor v1 = new Vendedor("Andres","Perez", 1,0.1);
        Vendedor v2 = new Vendedor("Mario","Perez", 2,0.1);
        Vendedor v3 = new Vendedor("Jose","Garcia", 3,0.2);

        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);

        return vendedores;
    }
}
