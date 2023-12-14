public class EmpleadoPlanta extends Empleado implements AfiliacionSindical{

    public EmpleadoPlanta(String nombre, String apellido, double baseSalarial, int anios) {
        super(nombre, apellido, baseSalarial, anios);
    }

    @Override
    public double calcularSalario() {
        double salario = (2.5 * this.getBaseSalarial() + getBonoAntiguedad() - getAporteASindicato());
        return salario;
    }

    @Override
    public double getBonoAntiguedad() {
        if (this.getAnios()>10){
            return getBaseSalarial()*0.10;
        }else{
            return getBaseSalarial()*0.05;
        }
    }

    @Override
    public double getAporteASindicato() {
        if (this.getAnios()>10){
            return getBaseSalarial()*0.03;
        }else{
            return getBaseSalarial()*0.015;
        }
    }
}
