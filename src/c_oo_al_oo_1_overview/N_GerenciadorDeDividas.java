package c_oo_al_oo_1_overview;

public class N_GerenciadorDeDividas {
	//    public void efetuaPagamento(B_Divida divida, double valor) {
	//      divida.setValorPago(divida.getValorPago() + valor);
	//    }
	//
	//    // outros métodos
	//  }


	public class D_GerenciadorDeDividas {
//		public void efetuaPagamento(G_Divida divida, double valor) {
		public void efetuaPagamento(L_Divida divida, String nomePagador, String cnpjPagador, double valor) {
//			if (valor > 100) {
//				valor = valor - 8;
//			}
//			divida.setValorPago(divida.getValorPago() + valor);
			K_Pagamento pagamento = new K_Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.paga(valor);
			divida.getPagamentos().add(pagamento);
			//novamente temos que fazer a mesma coisa em dois lugares
			//novamente quebrou o encapsulamento
			//devemos encapsular esta lógica em dívida
		}
	}
}