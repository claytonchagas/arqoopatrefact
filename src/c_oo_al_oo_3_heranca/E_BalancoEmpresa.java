package c_oo_al_oo_3_heranca;

import java.util.HashMap;

public class E_BalancoEmpresa {
	private HashMap<String, C_Divida> dividas = new HashMap<String, C_Divida>();
	
    public void registraDivida(String credor, String cnpjCredor, double valor) {
      C_Divida divida = new C_Divida();
      divida.setTotal(valor);
      divida.setCredor(credor);
//      divida.getCnpjCredor().setCnpjCredor(cnpjCredor);// agora usamos o getter e depois o setter
      dividas.put(cnpjCredor, divida);
    }
    
    public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		C_Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			A_Pagamento pagamento = new A_Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.getPagamentos().registra(pagamento);
		}
	}
  }