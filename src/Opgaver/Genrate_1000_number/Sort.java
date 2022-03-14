package Opgaver.Genrate_1000_number;


public class Sort {

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivotint low = first + 1; // Index for forward search
            int high = last; // Index for backward search
            int low = first + 1;
            while (high > low) {
                // Search forward from left
                while (low <= high && list[low] <= pivot)
                    low++;

                // Search backward from right
                while (low <= high && list[high] > pivot)
                    high--;

                // Swap two elements in the list
                if (high > low) {
                    int temp = list[high];
                    list[high] = list[low];
                    list[low] = temp;
                }
            }

            while (high > first && list[high] >= pivot)
                high--;

            // Swap pivot with list[high]
            if (pivot > list[high]) {
                list[first] = list[high];
                list[high] = pivot;
                return high;
            }
            else {
                return first;
            }
        }

        /** A test method */
        public static void sort(String[] args) {
            int[] tabel = new int[1000];
            for (int i = 0; i < tabel.length; i++) {
                tabel[i] = (int) (Math.random() * 200);
            }
            quickSort(tabel);

        }


}
