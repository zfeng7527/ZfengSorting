package Sorting;

public class Main {

    public static void main(String[] args) {
	int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};

	System.out.print("Before: ");
	for(int num:testArr)
		System.out.print(num+" ");
    System.out.println();

    long time = System.nanoTime();
	util.bubbleSort(testArr);
	time=System.nanoTime() - time;

	System.out.print("After: ");
	for(int num:testArr)
	    System.out.print(num+" ");
	System.out.println();
	System.out.println("Time taken: "+time);
    }
}
