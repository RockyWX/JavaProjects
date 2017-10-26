public class InsertionSort {
    static void insertionSort(int[] a){
        if(a==null || a.length<=1) return;

        for(int i=0; i<a.length-1; i++){
            int k = i;
            int j = i+1;
            while(k>=0 && a[j]<a[k]){  // swap until find the proper position to insert
                swap(a, k, j);
                k--;
                j--;
            }
        }
    }

    static void swap(int[] a, int k, int j){
        int temp = a[k];
        a[k] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 5, 2, 8, 5, 1, 5, 5, 7};
        insertionSort (a);
        for (int i : a){
            System.out.println(i);
        }
    }
}
