package Sorting;

public class utility {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Swapping Functions
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Generates Random Array
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int[] randomIntArr(int count){
        int[] randomIntArr = new int[count];
for(int n=0;n<count-1;n++){
    randomIntArr[n]=(int)(Math.random()*1001);
}
return randomIntArr;
    }

    public static String[] randomStringArr(int num,int length) {
        String[] randomStringArr = new String[num];
        for (int i = num-1; i >= 0; i--){
            String s = "";
        for (int n = 0; n < length; n++) {
            char c = (char) ((Math.random() * 26) + 97);
            s += c;
        }
        randomStringArr[i]=s;
    }
        return randomStringArr;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Check Sorted
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean isSorted(int[] arr){
      for(int i=0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]){
              return false;
          }
      }
      return true;
    }

    public static boolean isSorted(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(0 > arr[i+1].compareTo(arr[i])){
                return false;
            }
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Generates a copy of the orginal array
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int[] copyArr(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
