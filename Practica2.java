import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        String nombre[] = new String[5];
        float sueldo[] = new float[5];
        int edad[] = new int[5];
        int edadMayorId=0;
        int sueldoMayorId=0;
        Scanner read = new Scanner(System.in);
        int ctrl = 0;
        do{
            System.out.println("Selecciona la operacion que desees efectuar:");
            System.out.println("1.Ingresar o modificar datos\n2.Consultar datos\n3.Salir");
            int sel;
            sel = read.nextInt();
            switch(sel){
                case 1:
                    for(int i = 0; i < 5; i++){
                        System.out.println("Ingresa el nombre del empleado " + i + ": ");
                        nombre[i] = read.next();
                        System.out.println("Ingresa el sueldo del empleado " + i + ": ");
                        sueldo[i] = read.nextFloat();
                        System.out.println("Ingresa la edad del empleado " + i + ": ");
                        edad[i] = read.nextInt();
                        System.out.println("Desea continuar con los datos del siguiente empleado? (Presione 1 para aceptar o cualquier otro valor para salir)");
                        int ctrl2;
                        ctrl2 = read.nextInt();
                        if(ctrl2 != 1){
                            break;
                        }else{
                            continue;
                        }     
                    }
                    break;
                case 2:
                    int ctrl4 = 1;
                    while(ctrl4 == 1){
                    System.out.println("Ingresa el numero del empleado que desees conocer los datos: ");
                    int ctrl3 = read.nextInt();
                    if (nombre[ctrl3] == null){
                        System.out.println("No has ingresado ningún dato");
                    }else{
                    System.out.println(nombre[ctrl3] + "\nSueldo: " + sueldo[ctrl3] + "\nEdad: " + edad[ctrl3]);
                    }
                    System.out.println("Para ver los datos de otro empleado presiona 1");
                    ctrl4 = read.nextInt();
                    }
                    break;
                case 3:
                    ctrl = 2;
                    break;
            }
        for (int j = 0; j < 4; j++){
            if (edad[j] > edad[j + 1]){
                edadMayorId = j;
            }else{
                edadMayorId = j + 1;
            }
        }
        for (int j = 0; j < 4; j++){
            if (sueldo[j] > sueldo[(j + 1)]){
                sueldoMayorId = j;
            }else{
                sueldoMayorId = j + 1;
            }
        }
        if (ctrl != 2){
        System.out.println("Deseas conocer el empleado con sueldo mayor? (Presiona 1): ");
        int ctrl5 = read.nextInt();
        if (ctrl5 == 1){
            if (nombre[sueldoMayorId] == null){
            System.out.println("No has ingresadfo todos los datos");
        }else{
            System.out.println(nombre[sueldoMayorId] + " " + sueldo[sueldoMayorId]);
        }
        }
        System.out.println("Deseas conocer el empleado de mayor edad? (Presiona 1): ");
        int ctrl6 = read.nextInt();
        if (ctrl6 == 1){
            System.out.println(nombre[edadMayorId] + " " + edad[edadMayorId]);
        }
        System.out.println("Para continuar ingresa 1: ");
        ctrl = read.nextInt();
        }
        }while(ctrl == 1);
    }
}