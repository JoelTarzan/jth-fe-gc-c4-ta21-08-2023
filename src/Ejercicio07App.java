import javax.swing.JOptionPane;

public class Ejercicio07App {

	public static void main(String[] args) {
		
		// Preguntamos la cantidad de euros
		String eurosString = JOptionPane.showInputDialog("Porfavor indique la cantidad de euros.");
		double euros = Double.parseDouble(eurosString);
		
		// Preguntamos la moneda a pasar
		String moneda = JOptionPane.showInputDialog("Porfavor indique la moneda a la que desea pasar (dolares, yenes o libras)");
		moneda = moneda.toLowerCase();
		
		// Llamamos a la función
		conversorEuros(euros, moneda);
	}
	
	public static void conversorEuros(double euros, String moneda) {
		switch (moneda) {
	        case "dolares":
	            
	        	JOptionPane.showMessageDialog(null, euros + " euros equivale a " + (euros * 1.28611) + " dolares.");
	            break;
	    
	        case "yenes":
	            
	        	JOptionPane.showMessageDialog(null, euros + " euros equivale a " + (euros * 129.852) + " yenes.");
	            break;
	
	
			case "libras":
			    
				JOptionPane.showMessageDialog(null, euros + " euros equivale a " + (euros * 0.86) + " libras.");
			    break;
	
	        default:
	
	        	JOptionPane.showMessageDialog(null, "La moneda introducida no es correcta.");
	            break;
		}
	}

}