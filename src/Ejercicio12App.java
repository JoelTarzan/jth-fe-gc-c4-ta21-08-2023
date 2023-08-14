import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {

		// Pedimos los parámetros
		String cantidadNumerosString = JOptionPane.showInputDialog("Indica la cantidad de números que deseas generar.");
		int cantidadNumeros = Integer.parseInt(cantidadNumerosString);

		// Creamos el array
		int numeros[] = crearArrayNumsAleatorios(cantidadNumeros, 1, 300);
		System.out.println("Array Original");
		mostrarArray(numeros);

		// Pedimos el número que buscaremos como último dígito
		String ultDigitoString = JOptionPane.showInputDialog("Indica el dígito con el que quieres que acaben los números. (Solo un número entero positivo)");
		char ultDigitoChar = ultDigitoString.charAt(0);

		// Generamos el array resultante y mostramos el array
		int numerosConUltDigito[] = arrayUltimoDigito(numeros, ultDigitoChar);
		System.out.println("Array con el ultimo digito indicado: " + ultDigitoChar);
		mostrarArray(numerosConUltDigito);
	}

	// Rellena un array del tamaño introducido por el usuarios por numeros primos aleatorios con min y max indicados
	public static int[] crearArrayNumsAleatorios(int cantidadNumeros, int numMin, int numMax) {

		int numeros[] = new int[cantidadNumeros];

		for (int i = 0; i < numeros.length; i++) {
			int numAleatorio = (int) (Math.floor(Math.random() * (numMax - numMin + 1)) + numMin);
			numeros[i] = numAleatorio;
		}

		return numeros;
	}

	// Devuelve un array con numeros de un array cuyo ultimo dígito es el indicado
	public static int[] arrayUltimoDigito(int[] numeros, char ultDigito) {

		int cantidadNumeros = 0;

		for (int i = 0; i < numeros.length; i++) {
			String numString = String.valueOf(numeros[i]);
			
			if (numString.charAt(numString.length() - 1) == ultDigito) {
				cantidadNumeros++;
			}
		}

		int arrayResultado[] = new int[cantidadNumeros];
		int indice = 0;

		for (int i = 0; i < numeros.length; i++) {
			String numString = String.valueOf(numeros[i]);
			
			if (numString.charAt(numString.length() - 1) == ultDigito) {
				arrayResultado[indice] = numeros[i];
				indice++;
			}
		}

		return arrayResultado;
	}

	// Muestra el contenido de un array por consola
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + i + " - Valor: " + array[i]);
		}

		System.out.println();
	}

}