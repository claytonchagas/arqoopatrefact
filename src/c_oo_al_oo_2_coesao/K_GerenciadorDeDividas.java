package c_oo_al_oo_2_coesao;

//criamos classes coesas, que possuem apenas uma responsabilidade
//S do SOLID -> SRP: Single Responsability Principle

public class K_GerenciadorDeDividas {
	public void efetuaPagamento(H_Divida divida, String nomePagador, String cnpjPagador, double valor) {
		B_Pagamento pagamento = new B_Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		divida.getPagamentos().registra(pagamento);
	}
}
