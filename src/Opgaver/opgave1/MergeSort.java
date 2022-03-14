package Opgaver.opgave1;
import java.util.Arrays;

public class MergeSort {


    //opgave 2 på word doc 140322
    //TODO 2.	Lav et program, hvor der i main erklæres et string array og der indsættes 10 strenge i array'et. Programmer nu de forskellige sorteringsalgoritmer, så de kan sortere arrays af strenge.
    //TODO Test sorteringsalgoritmerne med det oprettede array af strenge.

    public static void mergeSorting (String [] a, int from, int to){
        if (from == to){
            return;
        }
        int mid = (from + to) / 2;
        mergeSorting(a, from, mid );
        mergeSorting(a, mid + 1, to);
        merge(a, from, mid, to);
    }

    public static void merge (String [] a, int from,int mid, int to){
        int n = to - from + 1;
        String[] b = new String[n];
        int i1 = from;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= to){
            if (a[i1].compareTo(a[i2]) < 0){        //Her løses sortering via ascii-værdier på de individuelle bogstaver
                b[j] = a[i1];
                i1++;
            }
            else{
                b[j] =a[i2];
                i2++;
            }
            j++;
        }
        while (i1 <= mid){
            b[j] = a[i1];
            i1++;
            j++;
        }
        while (i2 <= to){
            b[j] = a[i2];
            i2++;
            j++;
        }
        for ( j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }


}
