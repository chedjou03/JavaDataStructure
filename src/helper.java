import java.util.Random;

public class helper {

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

}
