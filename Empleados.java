import java.util.Scanner;

public class Empleados {
    String nombre;
    int edad;
    float sueldo;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Empleados emp1 = new Empleados();
        Empleados emp2 = new Empleados();
        System.out.println("Ingresa el nombre del empleado 1");
        emp1.nombre = read.nextLine();
        System.out.println("Ingresa la edad del empleado 1");
        emp1.edad = read.nextInt();
        System.out.println("Ingresa el sueldo del empleado 1");
        emp1.sueldo = read.nextFloat();
        System.out.println("Ingresa el nombre del empleado 2");
        read.nextLine();
        emp2.nombre = read.nextLine();
        System.out.println("Ingresa la edad del empleado 2");
        emp2.edad = read.nextInt();
        System.out.println("Ingresa el sueldo del empleado 2");
        emp2.sueldo = read.nextFloat();
        System.out.println("El empleado " + emp1.nombre + " de edad " +emp1.edad + " tiene un sueldo de $" + emp1.sueldo + "\nEl empleado " + emp2.nombre + " de edad " +emp2.edad + " tiene un sueldo de $" + emp2.sueldo);
    }
}
