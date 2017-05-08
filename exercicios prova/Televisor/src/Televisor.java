
public class Televisor {
	
	
	String ligado;
	int canal;
	int volume;
	int canaltotal,volumetotal;
	boolean Status;
	String On;

	Televisor(){
		
	}
	
	Televisor(int numeroCanais){
		
		canal = numeroCanais;
	}
	
	//metodos
	
	void inicializaCanal(int CanalInic) {
		canal = CanalInic;
	
			
	}
	
	void inicializaCanalTot(int CanalTotalIn) {

		canaltotal = CanalTotalIn;
	}
	
	int canalAcima(){
		
		if (canal < canaltotal) {
			canal++;
			System.out.println("canal: " + canal);
	

		}
		return canal;
		
		
		
	}
	
	
	int canalAbaixo(){
		
		if (canal > 1) {
			canal--;
			System.out.println("canal: " + canal);
		

		}
		return canal;
		
		
		
	}
	
	///////////////////
	
void Televisorv(){
		
	}
	
	void Televisorv(int volumemax){
		
		volume = volumemax;
	}
	
	//metodos
	
	void inicializavolume(int volumeInic) {
		volume = volumeInic;
	
			
	}
	
	void inicializavolumeTot(int volumeTotalIn) {

		volumetotal = volumeTotalIn;
	}
	
	int volumeAcima (){
		
		if (volume < volumetotal) {
			volume++;
			System.out.println("volume: " + volume);
	

		}
		return volume;
		
		
		
	}
	
	
	int volumeAbaixo(){
		
		if (volume > 0) {
			volume--;
			System.out.println("volume: " + volume);
		

		}
		return volume;
		
		
		
	}
	
	
	


String status() {
	if (canal > 0) {
		Status = true;
		On = "Ligada";
	}else{
		Status = false;
		On = "Desligada";
	}
	return On;
}
	
	
	
	
	
	
	
}
