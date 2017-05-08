import java.util.Scanner;

public class Retangulo {
	double comprimento;
	double largura;
	double area;
	double perimetro;
	Scanner leitor = new Scanner(System.in);
	
	Retangulo(){
		
	}
	double calcularArea(){
		return area = comprimento * largura;
		
					
	}
	
	double calcularPerimetro(){
		
		
		return perimetro =  (2 * comprimento) + (2 * largura);
		
	
	}
	
	public void construtor(){
	
	
	System.out.println("Digite o valor da Largura do Retangulo: ");
	largura = leitor.nextDouble();
	System.out.println("Digite o Valor do Comprimento do Retangulo: ");
	comprimento = leitor.nextDouble();
}
	
	public void imprimir(){
	System.out.println(" A aréa do Retangulo é: " +calcularArea()+ " O  Comprimento : "+ comprimento+" A largura "+largura + " E o Perimetro de : "+calcularPerimetro());
	}
	
	

}
