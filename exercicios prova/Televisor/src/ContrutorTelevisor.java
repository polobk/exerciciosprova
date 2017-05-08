
public class ContrutorTelevisor {

	public static void main(String[] args) {
		Televisor tel = new Televisor(1);
		Televisor tel1 = new Televisor(1);	
		tel.inicializaCanalTot(10);
	
		
	
		System.out.println("Canal Maximo: " + tel.canaltotal);
		System.out.println("Staus: " + tel.status());
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		tel.canalAcima();
		System.out.println("---------");
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		tel.canalAbaixo();
		System.out.println("canal: " + tel.canaltotal);
		
		
		tel.inicializavolumeTot(10);
		
		System.out.println("Volume Maximo: " + tel.volumetotal);
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		tel.volumeAcima();
		System.out.println("Volume Máximo Atingido");
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		tel.volumeAbaixo();
		
		
	
		
		
		
		
		
		
		
		}
	

}
