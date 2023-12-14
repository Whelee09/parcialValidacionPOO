import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void addEmpleado(Empleado e){
       empleados.add(e);
    }
    public void imprimirNomina(){
        for (Empleado e: empleados) {
            System.out.println(e.getNombre() + " " + e.getApellido()+ " " + e.calcularSalario() + " " + e.getClass().getName());
        }
    }
}
