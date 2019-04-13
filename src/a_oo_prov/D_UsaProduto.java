package a_oo_prov;
//Compartilhamento de variáveis entre objetos
public class D_UsaProduto {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		C_Produto A, B, C;
		A = new C_Produto();
		B = new C_Produto();
		C = new C_Produto();
		
		A.codigo = 1;
		System.out.println("Valor do codigo em A: " + A.codigo);
		System.out.println("Valor do codigo em B: " + B.codigo);
		
		B.codigo = 2;
		System.out.println("Valor do codigo em A: " + A.codigo);
		System.out.println("Valor do codigo em B: " + B.codigo);
		System.out.println("Valor do codigo em C: " + C.codigo);
		
	}
}