import java.util.Scanner;

public class Calculator1 {
    public float firstNumber;
    float secondNumber;
    float result;

    public void getFirstNumber(float newVal1){
        firstNumber = newVal1; 
    }

    public void getSecondNumber(float newVal2){
        secondNumber = newVal2;
    }

    public float getResultAdd(){
        return firstNumber + secondNumber;
    }

    public float getResultSubs(){
        return firstNumber - secondNumber;
    }

    public float getResultMult(){
        return firstNumber * secondNumber;
    }

    public float getResultDiv(){
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingresa el primer valor: ");
        float anNumber1 = read.nextFloat();
        System.out.print("Ingresa el segundo valor: ");
        float anNumber2 = read.nextFloat();
        Calculator1 calc1 = new Calculator1();
        calc1.getFirstNumber(anNumber1);
        calc1.getSecondNumber(anNumber2);
        System.out.print("Ingresa el signo de la operación a realizar: ");
        String id = read.next();

        switch(id) {

            case "+":
                calc1.result = calc1.getResultAdd();
            break;

            case "-":
                calc1.result = calc1.getResultSubs();
            break;

            case "*":
                calc1.result = calc1.getResultMult();
            break;

            case "/":
                calc1.result = calc1.getResultDiv();
            break; 
        }

    System.out.println("El resultado de " + calc1.firstNumber + " " + id + " " + calc1.secondNumber + " es: " + calc1.result);
    }
}