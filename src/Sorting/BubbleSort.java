package Sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
    for(int n=0; n < arr.length-1; n++){
        if (arr[n] > arr[n+1]) {
            utility.swap(arr, n, n + 1);
            n= -1;
        }
    }
    return arr;
}
}