public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double baseSalarial;
    private int anios;

    public Empleado(String nombre, String apellido, double baseSalarial, int anios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.baseSalarial = baseSalarial;
        this.anios = anios;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public int getAnios() {
        return anios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public abstract double calcularSalario();
}
