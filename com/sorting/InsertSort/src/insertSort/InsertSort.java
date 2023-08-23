package insertSort;

public class InsertSort {

	private static void recorrido(int array[]) {
		int temp = 0;
		while (temp < array.length - 1) {
			if (array[temp] > array[temp + 1]) {
				swap(array, temp, temp + 1);
				temp = 0;
			} else {
				temp++;
			}
		}
	}

	private static void swap(int array[], int index1, int index2) {
		int temporal = array[index1];
		array[index1] = array[index2];
		array[index2] = temporal;
	}

	// Metodo que impirme el arreglo
	private static void print(int array[]) {
		for (int arr : array) {
			System.out.print(arr + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Insert Sort");
		int numbers[] = { 7, 6, 33, 1, 4, 3 }; // Array a modificar
		System.out.println("Numeracion sin ordenar");
		print(numbers);
		recorrido(numbers);
		System.out.println("\nNumeracion ordenada");
		print(numbers); // Mandamos a llamar al metodo

	}

}
