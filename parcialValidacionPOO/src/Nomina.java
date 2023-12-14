import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void addEmpleado(Empleado e){
       empleados.add(e);
    }
    public void imprimirNomina(){
        for (Empleado e: empleados) {
            System.out.println("Nombre:" + e.getNombre() + " \tApellido:" + e.getApellido()+ " \tSalario: " + e.calcularSalario() + " \ttipo de trabajador:" + e.getClass().getName());
        }
    }
}
