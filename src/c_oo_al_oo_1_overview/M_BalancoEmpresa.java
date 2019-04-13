package c_oo_al_oo_1_overview;

import java.util.HashMap;

public class M_BalancoEmpresa {
	private HashMap<String, L_Divida> dividas = new HashMap<String, L_Divida>();

	public void registraDivida(String credor, String cnpjCredor, double valor) {
		L_Divida divida = new L_Divida();
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
		L_Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
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
//			divida.setPagamentos(null);
		}
	}
}