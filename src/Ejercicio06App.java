import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		
		// Preguntamos el número
		String numString = JOptionPane.showInputDialog("Indica un número entero positivo.");

		// Mostramos el resultado controlando de que lo introducido sea un entero positivo
		try {
			int num = Integer.parseInt(numString);
			
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "El número indicado no es entero positivo.");
                
            } else {
                int numCifras = contarDigitos(num);
                JOptionPane.showMessageDialog(null, "El número de cifras es: " + numCifras);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número indicado no es válido.");
        }
		
	}
	
	// Cuenta las cifras de un número indicado
	public static int contarDigitos(int num) {
		
		int contador = 0;
		
		if (num == 0) {
			return 1;
		}
		
		while (num != 0) {
			num /= 10;
			contador++;			
		}
		
		return contador;
	}

}
