import java.util.Scanner;

public class Quadrado {
	double lado;
	double perimetro;
	double area;
	Scanner leitor = new Scanner(System.in);
	
	Quadrado(){
		
	}
	
	 double calcularArea() {
	        
	        return area = lado*lado;
	        
	       
	    }
	     double calcularPerimetro() {
	        
	        return perimetro = 4*lado;
	        
	        
	    }
	     
	     public void construtor(){
	    	 
	    	 
	    	 System.out.println("Informe do valor do lado do quadrado");
		        lado = leitor.nextDouble();
	     }
	     
	     public void imprimir(){
	     System.out.println("O quadrado de lado: "+lado+"\n Área: "+calcularArea()
         +"\nPerimetro: "+calcularPerimetro());
	
	     }
	

}
