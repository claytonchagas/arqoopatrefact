package a_oo_prov;
//Declaracao de metodos de uma classe
public class F_UsaProduto {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		E_Produto A, B;
		A = new E_Produto();
		B = new E_Produto();
		
		A.codigo = 10;
		A.nome = "Sabonete";
		A.quantidade = 5;
		A.preco = 0.54;
		
		System.out.println(A.codigo + " " + A.nome + " ");
		System.out.println(A.quantidade + " " + A.preco);
		
		A.mostraPreco();
		A.atualizoPreco(12);
		A.mostraPreco();
		
		B.preco = 5.45;
		B.mostraPreco();
		B.atualizoPreco(20);
		B.mostraPreco();
		
	}
}