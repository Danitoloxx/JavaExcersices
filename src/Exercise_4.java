import java.util.Scanner;

/**
 * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 */
public class Exercise_4 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number: ");
        int number = scanner.nextInt();
        scanner.close();
        divisibleForTwo(number);
    }

    public static void divisibleForTwo(int number){
        if (number%2==0){
            System.out.println("This number is divisible by 2");
        } else {
            System.out.println("This number isn't divisible by 2");
        }
    }
}
