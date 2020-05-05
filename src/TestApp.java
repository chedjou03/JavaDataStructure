import Sort.Sort;

public class TestApp {

	public static void main(String[] args) {
		Sort sorter = new Sort();
		helper helper = new helper();
		int i = 10;
		int[] intArray = new int[i];
		intArray = helper.loadArray(i);
		helper.displayArray(intArray);
		sorter.BubbleSort(intArray);
		helper.displayArray(intArray);
	}

}
