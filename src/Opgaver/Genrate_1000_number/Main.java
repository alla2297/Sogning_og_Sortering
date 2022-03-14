package Opgaver.Genrate_1000_number;

import Opgaver.opgave1.QuickSort2;

public class Main {
    public static void main(String[] args) {

        int[] numbers = GenrateNumbers.GenrateNumber();
        System.out.println("lænde på array " + numbers.length + "\n");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("array index [" + i + "] Array number (" + numbers[i] + ") ");
        }

        Sort.quickSort(numbers);
        System.out.print("\nsorted numbers\n");
        for (int j = 0; j < numbers.length ; j++) {
            System.out.println("array index [" + j + "] Array number (" + numbers[j] + ") ");

        }
        //TODO Selection Sort
    }
}
