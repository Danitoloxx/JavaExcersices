import java.util.Scanner;

/**
 * Pide un número por teclado e indica si es un número primo o no
 */
public class Exercise_9 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (primeNumber(number)){
            System.out.println("The number entered "+number+", is prime");
        } else {
            System.out.println("The number entered "+number+", is not prime");
        }
    }

    public static boolean primeNumber(int number){
        //0,1,2,4 no son primos.
        if(number == 0 || number == 1 || number == 4){
            return false;
        }
        //si se los puede dividir por alguno de esos numeros, no son primos.
        for(int x = 2; x < number / 2; x++){
            if(number % x == 0)
            return false;
        }
        // Si no se puede dividir por 0,1,2,4 es primo.
        return true;
    }
}
