package jss;

/**
 * Esta clase contiene los atributos y metodos para ordenar arrays
 * @author javis
 *
 */

class Ordenacion {
	
	/**
	 *  Metodo que ordena el array
	 * @param array Lista de datos ordenados
	 */
	public void ordenarArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			reemplazar(array, i, maxValue);
			imprimirArray(array);
		}
	}
	
	/**
	 * 
	 * @param numbers Lista de datos ordenados
	 * @return Datos ordenados de menor a mayor
	 */
	public int[] ordenarArray2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	 * Metodo que muestra el array por pantalla
	 * @param array Lista de datos ordenados
	 */
	public void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	/**
	 * Metodo que reemplaza un valor por otro dentro del array
	 * @param array Lista de datos ordenados
	 * @param a Variable1
	 * @param b Variable2
	 */
	public void reemplazar(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}