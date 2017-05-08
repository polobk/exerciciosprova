import java.util.Scanner;

public class Circulo {
	double raio;
	double perimetro;
	double area;
	Scanner leitor = new Scanner(System.in);
	
	Circulo(){
		
	}
	

	
	double Calculararea(){
		
		return area = 3.141516 * raio * raio;
	}
	
	double CalcularPerimetro(){
		
		
		return perimetro = 2 * 3.141516 * raio;
	}
public void construtor(){
		
		System.out.println(" Digite o Valor do Raio Do Circulo : ");
		raio = leitor.nextDouble();
		}
	
	public void imprimir(){
		System.out.println(" A Aréa do Circulo é : " +Calculararea() + "O perimetro : " + CalcularPerimetro()+ " e o Raio é : " + raio);
	}
	
}
	

