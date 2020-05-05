package Sort;

import java.util.Random;

public class Sort {
	int k = 0;
	public  void BubbleSort(int[] intArray) {
		for( int i = 0 ; i < intArray.length ; i++) {
			for( int j = i + 1 ; j < intArray.length ; j++) {
				if(intArray[j] > intArray[i]) {
					int tempValue =  intArray[j] ;
					intArray[j] = intArray[i];
					intArray[i] = tempValue;
				}
			}
		}
	}

}
