package c_oo_al_oo_1_overview;

public class I_GerenciadorDeDividas {
	//    public void efetuaPagamento(B_Divida divida, double valor) {
	//      divida.setValorPago(divida.getValorPago() + valor);
	//    }
	//
	//    // outros métodos
	//  }


	public class D_GerenciadorDeDividas {
		public void efetuaPagamento(G_Divida divida, double valor) {
//			if (valor > 100) {
//				valor = valor - 8;
//			}
//			divida.setValorPago(divida.getValorPago() + valor);
			divida.paga(valor);
		}
	}
}