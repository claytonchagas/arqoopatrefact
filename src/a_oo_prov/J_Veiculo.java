package a_oo_prov;
//Heranca
public class J_Veiculo {
	String nome;
	double velocidade;
	
	public void acelera() {
		if (velocidade <= 10) {
			velocidade++;
		}
	}
	
	public void frea() {
		if (velocidade > 0) {
			velocidade--;
		}
	}

}
