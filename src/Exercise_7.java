import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este número es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola
 */
public class Exercise_7 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        //Define the variable for the loop.
        int number;

        //Doing the verification.
        do {
            System.out.println("Introduce a number bigger than 0: ");
            number = scanner.nextInt();
        } while(number <0);

        //Print the result obtained.
        System.out.println("The number entered is "+number);
        scanner.close();
    }
}
