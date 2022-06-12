import java.util.Arrays;
import java.util.Scanner;

public class arrays{

    public static void main (String[] args){

        int[] unaVariable = {1, 2, 3, 4, 5};
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(unaVariable[2]);
        System.out.println(Arrays.toString(unaVariable));
        System.out.println(unaVariable);
        System.out.println();

        //---------------------------------------------

        int[] otraVariable = unaVariable;

        System.out.println(otraVariable[4]);

        int[] segundaVariable;
        segundaVariable = new int[5];
        segundaVariable[0] = unaVariable[0];
        System.out.println("unaVariable[0] => " + unaVariable[0]);
        System.out.println("segundaVariable[0] => " + segundaVariable[0]);
        System.out.println();

        segundaVariable[0] = 1;

        //---------------------------------------------

        int[] tercerVariable = {4, 8, 1, 19, 23, 6, 34, 8, 9};

        for (int i=0; i < tercerVariable.length; i++){
            System.out.println("Valor " + i + " => "+ tercerVariable[i]);
        }
        System.out.println();

        //---------------------------------------------
        
        int[][] unaMatriz = {
            {0,0,1,0,1,1,0,1,1},
            {1,0,1,1},
            {0,1,1,0,0,0,1},
            {1,1,0,0,1},
        };
        System.out.println(unaMatriz);
        System.out.println(unaMatriz[0]);
        System.out.println(unaMatriz[0][0]);
        System.out.println();

        for (int i=0 ; i < unaMatriz.length; i++){
            for (int j=0; j < unaMatriz[i].length; j++){
                System.out.print("[" + unaMatriz[i][j] + "] ");
            }
            System.out.println();
        }

    }
}