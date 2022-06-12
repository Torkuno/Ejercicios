import java.util.Scanner;

public class CalculoNotas {
    public static void main (String[] args){
        
        double notaExamenParcial = 7;
        double notaEjercicios = 9;
        double notaProfesor = 8;
        double notaExamenFinal = 6;

        double promedio = 
            (notaExamenParcial*0.25)+
            (notaEjercicios*0.20)+
            (notaProfesor*0.05)+
            (notaExamenFinal*0.50);

        System.out.println("Tu nota del examen final es: "+ notaExamenFinal +".");
        System.out.println("Tu promedio es: "+ promedio +".");

        if (promedio >= 5 && notaExamenFinal >=4) {
            System.out.println("Has pasado.");
        } else {
            System.out.println("Has reprobado.");
        }

    }
}