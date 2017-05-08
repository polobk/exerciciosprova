import java.util.Scanner;

public class ConstrutorCirculo {

	public static void main(String[] args) {
		Circulo ci = new Circulo();
			
		Scanner leitor = new Scanner(System.in);
		
			ci.construtor();
			ci.imprimir();
			ci.CalcularPerimetro();
			ci.Calculararea();

	}

}
