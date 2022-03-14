package Opgaver.opgave1;

public class QuickSort2 {
    public static void quickSort(String[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(String[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    private static int partition(String[] list, int first, int last) {
        String pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low].compareToIgnoreCase(pivot) <= 0)
                low++;

            // Search backward from right
            while (low <= high && list[high].compareToIgnoreCase(pivot) > 0)
                high--;

            // Swap two elements in the list
            if (high > low) {
                String temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high].compareToIgnoreCase(pivot) >= 0)
            high--;

        // Swap pivot with list[high]
        if (pivot.compareToIgnoreCase(list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    /** A test method */
    public static void main(String[] args) {
        String[] list = {"Marcus", "Bob", "Allan", "Martin"};
        quickSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }




}
