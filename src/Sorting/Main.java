package Sorting;

public class Main {

	//Bubble Sort
	public static void main(String[] args) {
		int[] testArr = utility.randomIntArr(10);

        int[] ArrCopy = utility.copyArr(testArr);
		System.out.print("Before: ");
		for (int num : ArrCopy)
			System.out.print(num + " ");
		System.out.println();

		long time = System.nanoTime();
		Sorting.bubbleSort(ArrCopy);
		time = System.nanoTime() - time;

		System.out.print("After: ");
		for (int num : ArrCopy)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("BubbleSort Time : " + time);

		if(utility.isSorted(ArrCopy)){
			System.out.println("Your list is sorted\n");
		}
		else System.out.println("Your list is not sorted.\n");

		//Selection Sort
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrCopy = utility.copyArr(testArr);
		System.out.print("Before: ");
		for (int num : ArrCopy)
			System.out.print(num + " ");
		System.out.println();

		time = System.nanoTime();
		Sorting.selectionSort(ArrCopy);
		time = System.nanoTime() - time;

		System.out.print("After: ");
		for (int num : ArrCopy)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("Selection Time : " + time);

		if(utility.isSorted(ArrCopy)){
			System.out.println("Your list is sorted.\n");
		}
		else System.out.println("Your list is not sorted.\n");

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Insertion Sort
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrCopy = utility.copyArr(testArr);
        System.out.print("Before: ");
		for (int num : ArrCopy)
			System.out.print(num + " ");
		System.out.println();

		time = System.nanoTime();
		Sorting.insertionSort(ArrCopy);
		time = System.nanoTime() - time;

		System.out.print("After: ");
		for (int num : ArrCopy)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("Insertion Time : " + time);

		if(utility.isSorted(ArrCopy)){
			System.out.println("Your list is sorted\n");
		}
		else System.out.println("Your list is not sorted.\n");
	}
}
