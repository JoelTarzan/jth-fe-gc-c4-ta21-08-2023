import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {

		// Pedimos los parámetros
		String cantidadNumerosString = JOptionPane.showInputDialog("Indica la cantidad de números que deseas generar.");
		String numMinString = JOptionPane.showInputDialog("Indica el valor mínimo del rango de numeros a generar.");
		String numMaxString = JOptionPane.showInputDialog("Indica el valor máximo del rango de numeros a generar.");

		int cantidadNumeros = Integer.parseInt(cantidadNumerosString);
		int numMin = Integer.parseInt(numMinString);
		int numMax = Integer.parseInt(numMaxString);

		// Creamos los dos arrays
		int numeros[] = crearNumsAleatorios(cantidadNumeros, numMin, numMax);
		int numeros2[] = numeros;
		
		// Reasignamos los valores del segundo array aleatoriamente
		numeros2 = crearNumsAleatorios(cantidadNumeros, numMin, numMax);
		
		// Generamos el tercer array
		int numeros3[] = productoDosArrays(numeros, numeros2);
		
		// Mostramos el contenido de cada array
		mostrarArray(numeros);
		mostrarArray(numeros2);
		mostrarArray(numeros3);
	}

	// Genera un array de la cantidad indicada con numeros aleatorios
	public static int[] crearNumsAleatorios(int cantidadNumeros, int numMin, int numMax) {

		int numeros[] = new int[cantidadNumeros];

		for (int i = 0; i < numeros.length; i++) {
			int numAleatorio = (int) (Math.floor(Math.random() * (numMax - numMin + 1)) + numMin);
			numeros[i] = numAleatorio;
		}

		return numeros;
	}
	
	// Genera un array a partir del producto de los valores de 2 arrays indicados
	public static int[] productoDosArrays(int[] arrayUno, int[] arrayDos) {
		
        int[] arrayTres = new int[arrayUno.length];
        
        for (int i = 0; i < arrayUno.length; i++) {
            int result = arrayUno[i] * arrayDos[i];
            arrayTres[i] = result;
        }
        
        return arrayTres;
    }
	
	// Muestra el contenido de un array por consola
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + i + " - Valor: " + array[i]);
		}
		
		System.out.println();
	}

}