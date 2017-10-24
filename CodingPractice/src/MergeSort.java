public class MergeSort {
    public static void mergesort (int[] array) {
        int[] helper = new int[array.length]; // Extra Space
        mergesort (array, helper, 0, array.length-1);
    }

    public static void mergesort (int[] array, int[] helper, int left, int right) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            mergesort (array, helper, left, mid); // Sort Left
            mergesort (array, helper, mid+1, right); // Sort Right
            merge (array, helper, left, mid, right); // Merge
        }
    }

    public static void merge (int[] array, int[] helper, int left, int mid, int right) {
        if (array[mid] <= array[mid+1]) return; // Since two parts are already sorted

       for (int i=left; i<=right; i++) { // Copy elements to helper array
            helper[i] = array[i];
        }

        int helperLeft = left;
        int helperRight = mid+1;
        int current = left;

        while (helperLeft<=mid && helperRight<=right) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft++];
            } else {
                array[current] = helper[helperRight++];
            }
            current++;
        }

        int remaining = mid - helperLeft;  // Only left part has remaining elements which have to be copied.
        for (int i=0; i<=remaining; i++) {
            array[current+i] = helper[helperLeft+i];
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 5, 2, 8, 1, 2, 2, 7};
        mergesort (a);
        for (int i : a){
            System.out.println(i);
        }
    }
}