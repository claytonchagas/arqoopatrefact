package a_oo_prov;

public class M_Generica {
	public static void main(String[] args) {
		K_Veiculo2 v2 = new K_Veiculo2();
		L_Veiculo3 v3 = new L_Veiculo3();
		v2.velocidade = 10;
		v3.velocidade = 20;
		mostraVelocidade(v2);
		mostraVelocidade(v3);
	}
	
	public static void mostraVelocidade(J_Veiculo veiculo) {
		System.out.println(veiculo.velocidade);
	}
}