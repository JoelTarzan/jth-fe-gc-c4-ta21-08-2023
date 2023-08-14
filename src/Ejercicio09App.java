import javax.swing.JOptionPane;

public class Ejercicio09App {

	public static void main(String[] args) {

		// Creamos el array
		int numeros[] = rellenarArray(0, 9);
		
		// Mostramos los valores de cada posición y la suma de estos
		valoresYSumaArray(numeros);
	}

	// Rellena un array del tamaño introducido por el usuarios y numeros aleatorios con min y max indicados
	public static int[] rellenarArray(int numMin, int numMax) {

		String tamanoArrayString = JOptionPane.showInputDialog("Indica el tamaño del array.");
		int tamanoArray = Integer.parseInt(tamanoArrayString);
		
		int numeros[] = new int[tamanoArray];

		for (int i = 0; i < numeros.length; i++) {
			int numAleatorio = (int) (Math.floor(Math.random() * (numMax - numMin + 1)) + numMin);
			numeros[i] = numAleatorio;
		}

		return numeros;
	}
	
	// Muestra los valores del array y la suma de todos ellos
	public static void valoresYSumaArray(int[] numeros) {
		
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice: " + i + " - Valor: " + numeros[i]);
			suma += numeros[i];
		}
		
		JOptionPane.showMessageDialog(null, "Suma total: " + suma);
	}

}