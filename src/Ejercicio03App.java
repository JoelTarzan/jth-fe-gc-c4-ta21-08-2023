import javax.swing.JOptionPane;

public class Ejercicio03App {

	public static void main(String[] args) {
		
		// Pedimos el n�mero por teclado
		String numString = JOptionPane.showInputDialog("Introduce un n�mero entero.");
		int num = Integer.parseInt(numString);
		
		// Llamamos a la funcion y mostramos el resultado
		if (esPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El n�mero " + num + " es primo.");
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero " + num + " no es primo.");
		}
		
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

}
