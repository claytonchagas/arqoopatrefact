package c_oo_al_oo_1_overview;

import java.util.HashMap;

public class P_BalancoEmpresa {
	private HashMap<String, O_Divida> dividas = new HashMap<String, O_Divida>();

	public void registraDivida(String credor, String cnpjCredor, double valor) {
		O_Divida divida = new O_Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}

	//    public void pagaDivida(String cnpjCredor, double valor) {
	//        B_Divida divida = dividas.get(cnpjCredor);
	//        if (divida != null) {
	//          divida.setValorPago(divida.getValorPago() + valor);
	//        }
	//      }

//	public void pagaDivida(String cnpjCredor, double valor) {
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		O_Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
//			if (valor > 100) {
//				valor = valor - 8;
//			}
//			divida.setValorPago(divida.getValorPago() + valor);
			K_Pagamento pagamento = new K_Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
//			divida.paga(valor);
//			divida.getPagamentos().add(pagamento);
//			divida.setPagamentos(null);
		}
	}
}