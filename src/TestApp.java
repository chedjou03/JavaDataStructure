import Sort.BubbleSort;

public class TestApp {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int i = 20;
		int[] intArray = new int[i];
		intArray = bubbleSort.loadArray(i);
		bubbleSort.displayArray(intArray);
		bubbleSort.BubbleSort(intArray);
		bubbleSort.displayArray(intArray);

	}

}
