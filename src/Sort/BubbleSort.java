package Sort;

import java.util.Random;

public class BubbleSort {

	public  void displayArray(int[] intArray) {
		for( int i = 0 ; i < intArray.length ; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println("");
	}

	public  int[] loadArray(int i) {
		Random rand = new Random(); 
		int[] intArray = new int[i];
		for(int j = 0 ; j < i ; j++) {
			intArray[j] = rand.nextInt(1000);
		}
		return intArray;
	}

	public  void BubbleSort(int[] intArray) {
		for( int i = 0 ; i < intArray.length ; i++) {
			for( int j = i + 1 ; j < intArray.length ; j++) {
				if(intArray[j] < intArray[i]) {
					int tempValue =  intArray[j] ;
					intArray[j] = intArray[i];
					intArray[i] = tempValue;
				}
			}
		}
	}

}
