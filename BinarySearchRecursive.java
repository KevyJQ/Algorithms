class Main {
	public static int binarySearch(int num, int[] array) {
	   return binarySearchRecursive(num, array, 0, array.length - 1);
	}

	private static int binarySearchRecursive(int num, int[] array, int low, int high) {
	   if (low <= high) {	//Checamos en dado caso que el valor que pedimos esta en el rango de valores 
		   int midP = low + (high - low) / 2;	//Encontramos el valor medio 

	   if (array[midP] == num) {	//checa si el valor en el arreglo en el punto medio es igual al valor que estamos pidiendo 
	      return midP;	// Si el valor es igual, lo regresa y acaba el codigo
	   } else if (array[midP] < num) {	//evaluenado si el valor en el arreglo en el punto medio es menor al valor que pedimos
	  	  // Aplicando la recursividad si el valor es mayor
	      return binarySearchRecursive(num, array, midP + 1, high);	
	   } else {
	   	  // Aplicando recursividad cuando el valor es menor
	      return binarySearchRecursive(num, array, low, midP - 1);	
	   }
	}
	return -1;
	}

	public static void main(String[] args) {
		// Para usar Binary Search el arreglo tiene que estar ordenado 
	   int numbers[] = { 1, 3, 4, 89, 90, 114, 200, 222, 233, 250, 299, 300, 345, 400, 500 };	//Arreglo ordenado
	   System.out.println(binarySearch(5, numbers));	//Mandamos a llamar a la funcion 
	}
}