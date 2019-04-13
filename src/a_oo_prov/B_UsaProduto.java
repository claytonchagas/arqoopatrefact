package a_oo_prov;
//Instanciacao de uma classe
public class B_UsaProduto {
	public static void main(String[] args) {
		A_Produto A, B, C;
		A = new A_Produto();
		B = new A_Produto();
		C = new A_Produto();
		
		System.out.println(A.codigo + " " + A.nome + " ");
		System.out.println(A.quantidade + " " + A.preco);
		
		A.codigo = 10;
		A.nome = "Sabonete";
		A.quantidade = 5;
		A.preco = 0.54;
		
		System.out.println(A.codigo + " " + A.nome + " ");
		System.out.println(A.quantidade + " " + A.preco);
		
		B.codigo = 11;
		B.nome = "Detergente";
		B.quantidade = 35;
		B.preco = 1.25;
		
		System.out.println(B.codigo + " " + B.nome + " ");
		System.out.println(B.quantidade + " " + B.preco);
		
		C.codigo = 12;
		C.nome = "Shampoo";
		C.quantidade = 3;
		C.preco = 3.65;
		
		System.out.println(C.codigo + " " + C.nome + " ");
		System.out.println(C.quantidade + " " + C.preco);
		
	}
}