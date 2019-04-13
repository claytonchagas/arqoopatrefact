package b_oo_jbas_clm;
//Objetos e classes
public class A_Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
//	depois de explicar os atributos, comecar os metodos
	
	void saca(double valor) {
		double saldoAlterado = saldo - valor;
		saldo = saldoAlterado;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
}
