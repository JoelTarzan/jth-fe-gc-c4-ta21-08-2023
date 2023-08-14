import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		
		// Preguntamos el n�mero
		String numString = JOptionPane.showInputDialog("Indica un n�mero entero positivo.");

		// Mostramos el resultado controlando de que lo introducido sea un entero positivo
		try {
			int num = Integer.parseInt(numString);
			
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "El n�mero indicado no es entero positivo.");
                
            } else {
                int numCifras = contarDigitos(num);
                JOptionPane.showMessageDialog(null, "El n�mero de cifras es: " + numCifras);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El n�mero indicado no es v�lido.");
        }
		
	}
	
	// Cuenta las cifras de un n�mero indicado
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
