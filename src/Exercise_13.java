/**
 * Crear una función que reciba dos arrays de números como parámetros (pueden ser de longitud diferente)
 * y que arme un array resultante con los números que sean mayores a 10 de cada uno de los arrays parámetro.
 */

public class Exercise_13 {
    public static void main(String[] arg){
        int[] array1 = {12,43,104,56,3,2,7,8,34};
        int[] array2 = {15,3,12,54,31,43,546,122};
        moreThanTen(array1, array2);
    }

    public static void moreThanTen(int[] array1, int[] array2){

        int[] array3 = new int[array1.length+ array2.length];
        int i = 0;

        for( i = 0; i< array1.length; i++){
            if(array1[i]>10){
                array3[i] = array1[i];
            }
        }

        for( int j = 0; j< array2.length; j++){
            if (array2[j]>10){
                array3[i+j] = array2[j];
            }
        }

        //remove zeros from array3
        int t = 0;

        for(int l = 0; l < array3.length; l++){
            if(array3[l] != 0){
                array3[t++] = array3[l];
            }
        }

        //create array to show results
        int[] definitiveArray = new int[t];
        System.arraycopy(array3, 0, definitiveArray, 0, t);

        for(int m = 0; m< definitiveArray.length;m++){
            System.out.print(definitiveArray[m]+" ");
        }
    }
}
