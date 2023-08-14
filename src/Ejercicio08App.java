import javax.swing.JOptionPane;

public class Ejercicio08App {

	public static void main(String[] args) {
		
		// Creamos el array
		int numeros[] = rellenarArray();
		
		// Lo mostramos por consola
		mostrarArray(numeros);
	}
	
	// Rellena un array con números introducidos por el usuario
	public static int[] rellenarArray() {
		
		int numeros[] = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			String numString = JOptionPane.showInputDialog("Indica un número entero positivo.");
			int num = Integer.parseInt(numString);
			
			numeros[i] = num;
		}
		
		return numeros;
	}
	
	// Mostramos un array por consola (como indica el enunciado)
	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice: " + i + " - Valor: " + numeros[i]);
		}
	}

}