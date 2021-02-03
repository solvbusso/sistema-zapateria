package modelos;

public class Vendedor extends Persona{
    private int idVendedor;
    private double salario;
    private int cantidadVendida;
    private double porcentajeComision;


    public Vendedor(String nombre, String apellido, int idVendedor, double porcentajeComision) {
        super(nombre, apellido);
        this.idVendedor = idVendedor;
        this.porcentajeComision = porcentajeComision;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public double getSalario() {
        double comision = cantidadVendida * porcentajeComision;
        salario = 10000 + comision;
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", idVendedor=" + idVendedor + '\'' +
                ", salario=" + salario +
                '}';
    }
}
