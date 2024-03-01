import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static sort.BubbleSort.*;
import static sort.QuickSort.*;
import static assessment.Factorial.*;
import static assessment.Array.*;

public class Main {

    public static void main(String[] args) {

        int[] array = {64, 34, 25, 12, 22, 11, 90};

        LocalDateTime initialTime = LocalDateTime.now();
        bubbleSort(array);
        LocalDateTime finalTime = LocalDateTime.now();
        System.out.println("Bubble Sort Ordenation:");
        printArrayBubbleSort(array);
        long time = initialTime.until(finalTime, ChronoUnit.MICROS);
        System.out.println("Bubble Sort time duration: " + time + "\n");

        initialTime = LocalDateTime.now();
        quickSort(array, 0, array.length - 1);
        finalTime = LocalDateTime.now();
        System.out.println("Quick Sort Ordenation:");
        printArrayQuickSort(array);
        time = initialTime.until(finalTime, ChronoUnit.MICROS);
        System.out.println("Quick Sort time duration: " + time + "\n");


        //GoDev pratical exercises
        //The first one I have failed XD. But now I remember recursive functions
        System.out.println("5! = " + factorial(5) + "\n");

        //This one, if I remember well, I got it right...I think
        int[] numeros = {5, 1, 6, 8, 1, -1};
        System.out.println("A saída tem que ser 8. Saída = " + readsArray(numeros));
    }
}