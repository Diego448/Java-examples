import java.util.Scanner;

public class Vehiculos {

    private String color, tipo, modelo;
    private int numeroPasajeros, cilindros;
    private void construirVehiculo(){
        System.out.println("Color: " + color + "\nTipo: " + tipo + "\nModelo: " + modelo + "\nNumero de pasajeros: " + numeroPasajeros + "\nNumero de cilindros: " + cilindros);
    }
    private void obtenerDatos(){
        Scanner read = new Scanner(System.in);
        System.out.println("Color: ");
        this.color = read.nextLine();
        System.out.println("Tipo: ");
        this.tipo = read.nextLine();
        System.out.println("Modelo: ");
        this.modelo = read.nextLine();
        System.out.println("Numero de pasajeros: ");
        this.numeroPasajeros = read.nextInt();
        System.out.println("Numero de cilindros: ");
        this.cilindros = read.nextInt();
    }
    public static void main(String[] args) {
        Vehiculos miCarro = new Vehiculos();
        miCarro.obtenerDatos();
        miCarro.construirVehiculo();
    }
}
