import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {

		// Llamamos a la funcion para crear el array de primos
		int numeros[] = rellenarArrayPrimosAleatorios();

		// Mostramos el número mayor del array
		JOptionPane.showMessageDialog(null, "El número mas grande es: " + buscarNumMayor(numeros));
	}

	// Devuelve si el num indicado es primo o no
	public static boolean esPrimo(int num) {

		int contadorDivisores = 0;

		for (int i = 1; i <= num; i++) {

			if(num % i == 0) {
				contadorDivisores++;
			}
		}

		return contadorDivisores == 2;
	}

	// Rellena un array del tamaño introducido por el usuarios por numeros primos aleatorios con min y max indicados
	public static int[] rellenarArrayPrimosAleatorios() {

		String cantidadNumerosString = JOptionPane.showInputDialog("Indica la cantidad de números que deseas generar.");
		String numMinString = JOptionPane.showInputDialog("Indica el valor mínimo del rango de numeros a generar.");
		String numMaxString = JOptionPane.showInputDialog("Indica el valor máximo del rango de numeros a generar.");
		
		int cantidadNumeros = Integer.parseInt(cantidadNumerosString);
		int numMin = Integer.parseInt(numMinString);
		int numMax = Integer.parseInt(numMaxString);

		int numeros[] = new int[cantidadNumeros];

		for (int i = 0; i < numeros.length; i++) {
			int numAleatorio = (int) (Math.floor(Math.random() * (numMax - numMin + 1)) + numMin);
			
			if (esPrimo(numAleatorio)) {
				numeros[i] = numAleatorio;
			} else {
				i--;
			}
		}

		return numeros;
	}
	
	// Devuelve el número mas grande de un array
	public static int buscarNumMayor(int[] numeros) {
		
		int numMayor = Integer.MIN_VALUE;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numMayor) {
				numMayor = numeros[i];
			}
		}
		
		return numMayor;
	}

}