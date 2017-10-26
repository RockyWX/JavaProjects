public class SelectionSort {

    static void selectionSort(int[] a){
        if(a == null || a.length <= 1) return;

        for(int i=0; i<a.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {  // select the smallest element
                    minIndex = j;
                }
            }
            System.out.println("min element is " + a[minIndex] + " with index " + minIndex);
            // insert the smallest element to sorted part at the proper position
            if(minIndex != i)
                swap(a, i, minIndex);
        }
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 5, 2, 8, 5, 1, 5, 5, 7};
        selectionSort (a);
        for (int i : a){
            System.out.println(i);
        }
    }
}
