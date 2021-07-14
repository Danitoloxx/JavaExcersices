import java.util.Scanner;

/**
 * Eliminar los espacios de una frase pasada por consola por el usuario.
 * Por ejemplo, si ingreso “el dia esta hermoso para programar” debería devolver “eldiaestahermosoparaprogramar”.
 */
public class Exercise_11 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Introduzca una frase ");
        String frase = scanner.next();

        deleteSpaces(frase);
    }

    public static void deleteSpaces(String frase){
        String final_text = "";
        char caracter;

        for(int i=0; i<frase.length(); i++){
            caracter = frase.charAt(i);
            if(caracter!=' '){
                final_text+=String.valueOf(caracter);
            }
        }
        System.out.println("La frase sin espacios queda asi: '"+final_text+"'");
    }
}
