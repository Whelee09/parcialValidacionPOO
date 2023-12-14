import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido;
        double baseSalarial;
        int anios;
        int opcion;
        int opcion2=0;

        do {
            do {
                System.out.println("Bienvenido a la empresa SOLUCIONES CLICK DERECHO");
                System.out.println("ingrese '1' para agregar un empleado de planta o '2' para agregar un empleado temporal ");
                opcion = entrada.nextInt();
            }while(opcion >2 || opcion <1);


            System.out.println("Ingrese el nombre del trabajdor");
            entrada.nextLine();
            nombre = entrada.nextLine();
            //aqui hay que dar un enter para limpiar el buffer de entrada
            entrada.nextLine();

            System.out.println("Ingrese el apellido del trabajador");
            apellido = entrada.nextLine();

            System.out.println("Ingrese la base salarial del trabajador");
            baseSalarial = entrada.nextDouble();

            System.out.println("Ingrese los anios de antiguedad del trabajdor");
            anios = entrada.nextInt();


            if (opcion == 1){
                Empleado eTemporal = new EmpleadoTemporal(nombre, apellido, baseSalarial, anios);
                nomina.addEmpleado(eTemporal);
            }else{
                Empleado ePlanta = new EmpleadoPlanta(nombre, apellido, baseSalarial, anios);
                nomina.addEmpleado(ePlanta);
            }

            do {
                System.out.println("Desea agregar a otro empleado?");
                System.out.println("Presione 1 para SI o '2' para NO");
                opcion2 = entrada.nextInt();
            }while (opcion2>2 || opcion2<1);

        }while (opcion2 ==1);
        nomina.imprimirNomina();
        entrada.close();
    }
}


//        Empleado eTemporal = new EmpleadoTemporal("WIlliangel", "Quevedo", 2000, 4);
//        Empleado ePlanta1 = new EmpleadoPlanta("Angi", "Quevedo", 3000, 5);
//        Empleado ePlanta2 = new EmpleadoPlanta("Angela", "Villamizar", 5000, 12);
//
//        nomina.addEmpleado(eTemporal);
//        nomina.addEmpleado(ePlanta1);
//        nomina.addEmpleado(ePlanta2);
//        nomina.imprimirNomina();