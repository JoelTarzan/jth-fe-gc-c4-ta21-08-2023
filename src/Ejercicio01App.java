import javax.swing.JOptionPane;

public class Ejercicio01App {

	public static void main(String[] args) {
		
		// Se pregunta la figura geométrica
		String figura = JOptionPane.showInputDialog("Elige una figura: circulo, cuadrado o triangulo.");
		figura = figura.toLowerCase();
		
		// Según la figura elegida, se piden unos datos y se llama a una función u otra
		switch (figura) {
			case "circulo":
				String radioString = JOptionPane.showInputDialog("Introduce el radio del circulo en cm.");
				
				double radio = Double.parseDouble(radioString);
				double resultadoCirculo = areaCirculo(radio);
				
				JOptionPane.showMessageDialog(null, "El área del circulo es de " + resultadoCirculo + " cm2");
				break;
				
			case "cuadrado":
				String ladoString = JOptionPane.showInputDialog("Introduce el lado del cuadrado en cm.");
				
				double lado = Double.parseDouble(ladoString);
				double resultadoCuadrado = areaCuadrado(lado);
				
				JOptionPane.showMessageDialog(null, "El área del cuadrado es de " + resultadoCuadrado + " cm2");
				break;
				
			case "triangulo":
				String baseString = JOptionPane.showInputDialog("Introduce la base del triangulo en cm.");
				String alturaString = JOptionPane.showInputDialog("Introduce la altura del triangulo en cm.");
				
				double base = Double.parseDouble(baseString);
				double altura = Double.parseDouble(alturaString);
				double resultadoTriangulo = areaTriangulo(base, altura);
				
				JOptionPane.showMessageDialog(null, "El área del triangulo es de " + resultadoTriangulo + " cm2");
				break;
	
			default:
				JOptionPane.showMessageDialog(null, "La figura introducida no es correcta.");
				break;
		}
		
	}
	
	// Calcula el area de un círculo
	public static double areaCirculo(double radio) {
		return (Math.pow(radio, 2) * Math.PI);
	}
	
	// Calcula el area de un cuadrado
	public static double areaCuadrado(double lado) {
		return lado * lado;
	}
	
	// Calcula el area de un triangulo
	public static double areaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

}