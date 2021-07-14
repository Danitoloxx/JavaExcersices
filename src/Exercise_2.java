import org.jetbrains.annotations.NotNull;

/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */
public class Exercise_2 {

    public static void main(String[] arg){
        //Dates
        int num1 = 1110;
        int num2 = 110;
        variableCompare(num1,num2);
    }

    public static void variableCompare(int num1, int num2){
        if(num1>num2){
            System.out.println("The fist variable is larger than second.");
        }else if(num2>num1){
            System.out.println("The second variable is larger than first.");
        }else{
            System.out.println("Variables are equal.");
        }
    }
}

