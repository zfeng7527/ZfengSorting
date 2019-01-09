package Sorting;

public class Sorting {

    public static int[] bubbleSort(int[] arr){
    for(int n=0; n < arr.length-1; n++){
        if (arr[n] > arr[n+1]) {
            utility.swap(arr, n, n + 1);
            n= -1;
        }
    }
    return arr;
}

public static int[] selectionSort(int[] arr){
        int lowest = 0;
        for(int i=0; i<arr.length-1;i++){
            lowest = i;
            for(int j=1; j<arr.length-i;j++){
                if(arr[lowest]>arr[i+j]){
                    lowest = i+j;
                }
            }
            utility.swap(arr,i,lowest);
        }
    return arr;
}

public static int[] insertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    utility.swap(arr,j,j-1);
                }
            }
        }
        return arr;
}
}
