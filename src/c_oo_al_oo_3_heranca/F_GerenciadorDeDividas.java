package c_oo_al_oo_3_heranca;

//criamos classes coesas, que possuem apenas uma responsabilidade
//S do SOLID -> SRP: Single Responsability Principle

public class F_GerenciadorDeDividas {
	public void efetuaPagamento(C_Divida divida, String nomePagador, String cnpjPagador, double valor) {
		A_Pagamento pagamento = new A_Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		divida.getPagamentos().registra(pagamento);
	}
}
