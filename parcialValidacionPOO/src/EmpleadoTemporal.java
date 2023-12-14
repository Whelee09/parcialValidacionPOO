public class EmpleadoTemporal extends Empleado{

    public EmpleadoTemporal(String nombre, String apellido, double baseSalarial, int anios) {
        super(nombre, apellido, baseSalarial, anios);
    }

    @Override
    public double calcularSalario() {
        double salario = (2.5 * this.getBaseSalarial() - this.getBaseSalarial() * 0.286);
        return salario;
    }
}
