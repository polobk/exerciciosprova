public class ProjetoMoto {
	// atributos
	String marca;
	String modelo;
	String cor;
	int marcha;
	int marchatot;
	boolean Status;
	String On;

	ProjetoMoto() {

	}

	ProjetoMoto(int ultimamacha) {
		marcha = ultimamacha;
	}

	// metodos

	void inicializaMarcha(int marchaIn) {
		marcha = marchaIn;

	}

	void inicializaMarchaTot(int marchaTotalIn) {

		marchatot = marchaTotalIn;
	}

	int PassarMacha() {
		if (marcha < marchatot) {
			marcha++;
			System.out.println("Marcha: " + marcha);
		} else {
			System.out.println("Limite de marchas atingido.");

		}
		return marcha;
	}

	int DiminuirMacha() {
		if (marcha > 0) {
			marcha--;
			System.out.println("Marcha: " + marcha);
		} else {
			System.out.println("Marcha Minima Atingida ");

		}
		return marcha;
	}
	
	String status() {
		if (marcha > 0) {
			Status = true;
			On = "Ligada";
		}else{
			Status = false;
			On = "Desligada";
		}
		return On;
	}

}

