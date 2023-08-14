import javax.swing.JOptionPane;

public class Ejercicio02App {

	public static void main(String[] args) {
		
		// Pedimos los parámetros
		String cantidadNumerosString = JOptionPane.showInputDialog("Indica la cantidad de números que deseas generar.");
		String numMinString = JOptionPane.showInputDialog("Indica el valor mínimo del rango de numeros a generar.");
		String numMaxString = JOptionPane.showInputDialog("Indica el valor máximo del rango de numeros a generar.");
		
		int cantidadNumeros = Integer.parseInt(cantidadNumerosString);
		int numMin = Integer.parseInt(numMinString);
		int numMax = Integer.parseInt(numMaxString);
		
		// Llamamos a las funciones
		int numeros[] = crearNumsAleatorios(cantidadNumeros, numMin, numMax);
		obtenerNumAleatorio(numeros);

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
	
	// Devuelve un mensaje del valor de una posicion aleatoria de una lista
	public static void obtenerNumAleatorio(int[] numeros) {
		
		int posicion = (int) Math.floor(Math.random() * numeros.length);
		JOptionPane.showMessageDialog(null, "El número aleatorio es: " + numeros[posicion]);
	}

}
