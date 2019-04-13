package b_oo_jbas_clm;

public class D_TestaConta2 {
	public static void main(String[] args) {
		C_Conta2 c2;
		c2 = new C_Conta2();

		c2.numero = 002;
		c2.nome = "Maria";
		c2.saldo = 100.0;
		c2.limite = 10.0;

		System.out.println("Numero da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);

		int saque = 110;

//		int saque = 120;
		
		boolean resultado = c2.saca(saque);
		if (resultado) {
			System.out.println("Voce sacou R$"+saque+" e seu saldo atual eh R$"+c2.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do possivel");
		}
	}
}