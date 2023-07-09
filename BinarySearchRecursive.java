class Main {
	public static int binarySearch(int num, int[] array) {
	   return binarySearchRecursive(num, array, 0, array.length - 1);
	}

	private static int binarySearchRecursive(int num, int[] array, int low, int high) {
	   if (low <= high) {
		   int midP = low + (high - low) / 2;

	   if (array[midP] == num) {
	      return midP;
	   } else if (array[midP] < num) {
	      return binarySearchRecursive(num, array, midP + 1, high);
	   } else {
	      return binarySearchRecursive(num, array, low, midP - 1);
	   }
	}
	return -1;
	}

	public static void main(String[] args) {
	   int numbers[] = { 1, 3, 4, 89, 90, 114, 200, 222, 233, 250, 299, 300, 345, 400, 500 };
	   System.out.println(binarySearch(4, numbers));
	}
}