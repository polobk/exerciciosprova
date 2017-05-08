
public class ExecultaProjMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjetoMoto pmt = new ProjetoMoto(1);
		pmt.marca = "Honda";
		pmt.modelo = "H200";
		pmt.cor = "Preto";
		pmt.inicializaMarchaTot(4);
		System.out.println("Marca: " + pmt.marca);
		System.out.println("Modelo: " + pmt.modelo);
		System.out.println("Cor: " + pmt.cor);
		System.out.println("Marcha Maxima: " + pmt.marchatot);
		System.out.println("Staus: " + pmt.status());
		pmt.PassarMacha();
		pmt.PassarMacha();
		pmt.PassarMacha();
		pmt.PassarMacha();
		System.out.println("---------");
		pmt.DiminuirMacha();
		pmt.DiminuirMacha();
		pmt.DiminuirMacha();
		pmt.DiminuirMacha();
		System.out.println("Staus: " + pmt.status());
	}
	

}
