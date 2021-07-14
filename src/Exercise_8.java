import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no
 * (si ingreso “jueves” me debería decir que si es laboral).
 */
public class Exercise_8 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a day to know if it is a working day or not");
        System.out.println("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday");
        String input = scanner.next().toLowerCase();
        laborDay(input);
        }

        public static void laborDay(String input){
            switch (input){
                case "monday":
                    System.out.println("Monday it's working day");
                    break;
                case "tuesday":
                    System.out.println("Tuesday it's working day");
                    break;
                case "wednesday":
                    System.out.println("Wednesday it's working day");
                    break;
                case "thursday":
                    System.out.println("Thursday it's working day");
                    break;
                case "friday":
                    System.out.println("Friday it's working day");
                    break;
                case "saturday":
                    System.out.println("Saturday it's working day");
                    break;
                case "sunday":
                    System.out.println("SUNDAY it's not a working day");
                    break;
                default:
                    System.out.println("Please, introduce a valid day of the week.");
            }
        }
    }
