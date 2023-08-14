import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		
		// Preguntamos el número
		String numString = JOptionPane.showInputDialog("Introduce un número entero.");
		int num = Integer.parseInt(numString);
		
		// Llamamos a la función y mostramos el resultado
		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + calcularFactorial(num));
		
	}
	
	// Calcula el factorial de un número indicado
	public static int calcularFactorial(int num) {
		
		int factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		return factorial;
	}

}