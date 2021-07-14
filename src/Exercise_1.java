/**
 * Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 */
public class Exercise_1 {

    public static void main(String[] arg){
        //Variables
        double num1 = 20;
        double num2 = 6;


        System.out.println("El valor de la suma es: "+suma(num1, num2));
        System.out.println("El valor de la resta es: "+resta(num1, num2));
        System.out.println("El valor de la multiplicacion es: "+multiplicacion(num1, num2));
        System.out.println("El valor de la division es: "+division(num1, num2));
        System.out.println("El valor del modulo es: "+modulo(num1, num2));
    }

    public static double suma(double num1, double num2){
       return num1 + num2;
    }

    public static double resta(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static double modulo(double num1, double num2){
        return num1 % num2;
    }
}
