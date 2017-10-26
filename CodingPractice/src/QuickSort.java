public class QuickSort {
    static void quickSort (int[] array) {
        quickSort (array, 0, array.length-1);
    }

    static void quickSort (int[] array, int left, int right) {
        int index = sort (array, left, right);
        if (left < index-1) {
            quickSort (array, left, index-1);
        }
        if (index < right) {
            quickSort (array, index, right);
        }
    }

    static int sort (int[] array, int left, int right) {
        int pivot = array[(left+right)>>>1];  // >>>1 is equivalent to /2, but without overflow issue.
        while (left <= right) {  // make sure left pass right, which means including left in return
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

    static void swap (int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 5, 2, 8, 5, 1, 5, 5, 7};
        quickSort (a);
        for (int i : a){
            System.out.println(i);
        }
    }
}