package b_oo_jbas_clm;
//acessando atributos e chamando metodos da classe
public class B_TestaConta1 {
	public static void main(String[] args) {
		A_Conta c1;
		c1 = new A_Conta();
//		A declaracao e a instanciacao pode ser na mesma linha
//		A_Conta c1 = new A_Conta();
		
		c1.numero = 001;
		c1.nome = "Joao";
		c1.saldo = 100.0;
		c1.limite = 10.0;
		
		System.out.println("Numero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
		c1.saca(10);
		System.out.println("Saldo atual: "+c1.saldo);
		
		c1.deposita(1000);
		System.out.println("Saldo atual: "+c1.saldo);
	}
}