package b_oo_jbas_clm;

public class C_Conta2 {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean saca(double valor) {
		if ((this.saldo + this.limite) < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
}
