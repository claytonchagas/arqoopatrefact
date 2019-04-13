package a_oo_prov;
//Declaracao de metodos de uma classe
public class E_Produto {
	static int codigo;
	String nome;
	int quantidade;
	double preco;
	
	public void mostraPreco() {
		System.out.println(preco);
	}
	
	public void atualizoPreco(double porc) {
		preco = preco + preco*porc/100;
	}

}