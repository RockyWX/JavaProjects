public class QuickSort {
    public static void quicksort (int[] array) {
        quicksort (array, 0, array.length-1);
    }

    public static void quicksort (int[] array, int left, int right) {
        int index = sort (array, left, right);
        if (left < index-1) {
            quicksort (array, left, index-1);
        }
        if (index < right) {
            quicksort (array, index, right);
        }
    }

    public static int sort (int[] array, int left, int right) {
        int pivot = array[(left+right)>>>1];  // >>>1 is equivalent to /2, but without overflow issue.
        while (left <= right) {  // make sure left pass right, which means including left in left interval
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;
            if (left <= right) {
                swap (array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap (int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 5, 2, 8, 5, 1, 5, 5, 7};
        quicksort (a);
        for (int i : a){
            System.out.println(i);
        }
    }
}