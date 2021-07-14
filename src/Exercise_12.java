import java.util.Scanner;

/**
 * Crea una función que cuente el número de vocales que contiene una cadena.
 * Desde la función principal tendrás que pedir una palabra o frase al usuario
 * y tendrás que mostrar el número de vocales que contiene haciendo uso de la función anterior.
 */
public class Exercise_12 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Introduzca una frase o una palabra: ");
        String input = scanner.next();

        showVowels(input);
    }

    public static void showVowels(String input){
        int counter = 0;
        //Recorre la frase/palabra con un ciclo For controlando el tamaño con el metodo length.
        for(int i = 0; i < input.length();i++){
            if((input.charAt(i) == 'a') || (input.charAt(i) == 'e') || (input.charAt(i) == 'i') || (input.charAt(i) == 'o') || (input.charAt(i) == 'u')){
                counter++;
            }
        }
        //Imprime el resultado.
        System.out.println("La cantidad de vocales que hay en la frase/palabra '"+input+"' es igual '"+counter+"'");
    }
}
