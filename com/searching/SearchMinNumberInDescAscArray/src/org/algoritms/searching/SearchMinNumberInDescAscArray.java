package org.algoritms.searching;

public class SearchMinNumberInDescAscArray {
	
	/* 
	 * Estaremos implementando la busqueda binaria con recursividad 
	 * Este codigo se uso implementando los casos prueba (TestCase)
	 * Este codigo se esta implementado para un patron como el siguiente 23, 22, 15, 16, 17, 18, 19, 21. Donde los valores no estan 100% en orden
	 * Asc o Desc pero cuentan con un patron que podemos atacar
	 * */
	
	public static int findMinNumberInDescAscArray2(int[] array, int leftIdx, int rigthIdx) {	
		if (rigthIdx - leftIdx == 1) {	//Checamos que en dado caso que sea de tamaño 2 el arreglo
			return findMinTwoElements(array, leftIdx, rigthIdx); //Mandamos a llamar al metodo y le mandamos los parametros (arreglo, el valor izquierdo, valor derecho)
		}
		int midP = leftIdx + (rigthIdx - leftIdx) / 2;	//Sacamos el punto intermedio del arreglo

		// Asignamos los valores que tienen los siguientes puntos en el array
		int midNum = array[midP];	// Valor en el indice medio
		int leftNum = array[midP - 1];	// Valor en el indice medio menos 1
		int rigthNum = array[midP + 1];	// Valor en el indice medio mas 1

		/*
		 * Primera condicion, cuando el valor mas pequeño que estamos buscando esta justo a la mitad 
		 * */
		if (leftNum > midNum && midNum < rigthNum) {	
			return midNum;
		}
		/*
		 * Segunda condicion, cuando el valor que estamos buscando se encuentra de lado derecho, 
		 * ajustamos los valores de inicio y valores finales del array
		 * */
		if (leftNum > midNum) {
			return findMinNumberInDescAscArray2(array, midP + 1, rigthIdx);
		}
		/*
		 * Tercera condicion, en dado caso que no cumpla con la de arriba, asumimos que el valor que buscamos esta de lado izquierdo
		 * por lo tanto hacemos lo mismo y ajustamos los parametro nuevamente indicandole ahora cual es nuestro primer valor en el array y cual es el ultimos
		 * */
		return findMinNumberInDescAscArray2(array, leftIdx, midP - 1);
	}

	public static int findMinTwoElements(int[] array, int leftIdx, int rigthIdx) {	//Metodo que checa el valor minimos entre 2 valores y regresa el valor menor
		return Math.min(array[leftIdx], array[rigthIdx]);
	}

	public static int findMinNumberInDescAscArray(int[] array) {
		// Caso de prueba 1: En dado caso que solo tengamos un arreglo con 1 valor
		if (array.length == 1) {
			return array[0];
		}
		// Caso de prueba 2: En dado caso que tengamos un arreglo con 2 valores obtenemos el minimos con ayuda de la libreir Math
		if (array.length == 2) {
			return Math.min(array[0], array[1]);
		}
		// Caso de prueba 3: En dado caso que tengamos que encontrar el valor mas pequeño en un arreglo de 3 valores
		if (array.length == 3) {
			int value = Math.min(array[0], array[1]);
			return Math.min(value, array[2]);
		}
		// Implementamos la recursividad 
		return findMinNumberInDescAscArray2(array, 0, array.length - 1);	// Le mandamos los parametros de arreglo , donde inicia y el tamaño del arreglo
	}
	// Main
	public static void main(String[] args) {

	}
}
