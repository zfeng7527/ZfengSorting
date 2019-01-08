package Sorting;

public class utility {

    public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    public static int[] randomIntArr(int count){
        int[] randomIntArr = new int[count];
for(int n=0;n<count-1;n++){
    randomIntArr[n]=(int)(Math.random()*1001);
}
return randomIntArr;
    }

    public static char[] randomStringArr(int count){
        char[] randomStringArr = new char[count];
        for(int n=0;n<count-1;n++){
            randomStringArr[n]=(char)((Math.random()*26)+97);
        }
        return randomStringArr;
    }

    public static boolean isSorted(int[] arr){
      for(int i=0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]){
              return false;
          }
      }
      return true;
    }

}
