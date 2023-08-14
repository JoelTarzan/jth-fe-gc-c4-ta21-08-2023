import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {

		// Preguntamos el n�mero
		String numString = JOptionPane.showInputDialog("Indica que n�mero quieres pasar a binario.");
		int num = Integer.parseInt(numString);

		// Llamamos a la funci�n y mostramos el resultado
		JOptionPane.showMessageDialog(null, num + " a binario es: " + decimalABinario(num));
	}
	
	// Construye un String con el numero pasado a binario
	public static String decimalABinario(int num) {
        StringBuilder binarioString = new StringBuilder();
        
        while (num > 0) {
        	binarioString.insert(0, num % 2);
            num = num / 2;
        }
        
        return binarioString.toString();
    }

}