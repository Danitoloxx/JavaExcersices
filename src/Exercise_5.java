import java.util.Scanner;

/**
 * Lee un número o un caracter (char) por teclado y muestre por consola, el carácter al que pertenece en la tabla ASCII.
 * Por ejemplo: si introduzco un 97, me muestre una a.
 */
public class Exercise_5 {
    public static void main(String[] arg){
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Select one option to convert");
        System.out.println(" ");
        System.out.println("1-NUMBER to ACSII\n or\n2-CHARACTER to NUMBER? ");
        System.out.println(" ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Enter the number to convert: ");
                int number = scanner.nextInt();
                numberToCharacter(number);
                System.out.println("Goodbye");
                break;
            case 2:
                System.out.println("Enter the character to convert: ");
                char character = scanner.next().charAt(0);
                characterToAcsii(character);
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Please RE-RUN the program and chose an valid option.");
        }
        scanner.close();
    }

    public static void characterToAcsii(char character){
        int ascii = (int)character;
        System.out.println("The character entered is '"+character+"', it's equal to '"+ascii+ "' into the table of ACSII");
    }

    public static void numberToCharacter(int number){
        char character2 = (char)number;
        System.out.println("The number entered is '"+number+"', it's equal to '"+character2+"' Into the table of ACSII");
    }
}
