import java.util.Scanner;

public class Pessoa {
	
	
	// atributos ,apenas atributos vira aki 
		String nome;
		String endereco;
		String telefone;
		Scanner leitor = new Scanner (System.in);
		
		Pessoa(){
			
		}
		public void imprimir(){
			
			
			
			System.out.println("Ol� " + nome ) ;
			System.out.println("Seu Endere�o � :"+ endereco);
			System.out.println("Seu Telefone � :"+ telefone);
						
		
       
		}
		
		
		public void construtor(){
			System.out.println("Informe o nome da pessoa");
			nome = leitor.next();
	        
	        
	        System.out.println("Informe endere�o da pessoa");
	        endereco = leitor.next();
	        
	        
	        System.out.println("Informe o telefone da pessoa");
			telefone = leitor.next();
			
			
		}
        
}
