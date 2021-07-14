/**
 * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
 * Por ejemplo: si introduzco “Fernando”, me aparece “Bienvenido Fernando”.
 */
public class Exercise_3 {

    public static void main(String[] arg){
        //Dates
        String name = "Daniel";
        sayWelcome(name);
    }

    public static void sayWelcome(String name){
        System.out.println("Welcome "+name);
    }
}
