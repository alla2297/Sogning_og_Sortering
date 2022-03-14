package Opgaver.opgave1;

import java.util.Arrays;

 public class main {

     public static void main(String[] args) {
         MS();
         QS();
     }
    //MergeSort Funktion

    public static void MS () {
        String [] values = {"Marcus","Bob","Martin","Allan","Dan","Susanne","Mikkel","Niklas","Kim","Nikolaj","Nicolaj"};
        MergeSort.mergeSorting(values, 0, values.length - 1);
        System.out.println("Merge Sort Result " + Arrays.toString(values));

    }
    //QuickSort Funktion
    public static void QS(){
         String [] values = {"Marcus","Bob","Martin","Allan","Dan","Susanne","Mikkel","Niklas","Kim","Nikolaj","Nicolaj"};
         QuickSort2.quickSort(values);
        System.out.println("\nQuick Sort Result " + Arrays.toString(values));
    }
}
