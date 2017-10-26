public class BubbleSort {
    static void bubbleSort(int[] a){
        for(int i=0; i<a.length; i++)
            for(int j=1; j<a.length; j++){
                if(a[j]<a[j-1])  // compare adjacent elements and swap if necessary
                    swap(a, j, j-1);
            }

    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 5, 2, 8, 5, 1, 5, 5, 7};
        bubbleSort (a);
        for (int i : a){
            System.out.println(i);
        }
    }
}
