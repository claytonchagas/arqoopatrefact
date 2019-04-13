package c_oo_al_oo_2_coesao;

import java.util.HashMap;

public class F_BalancoEmpresa {
	private HashMap<String, H_Divida> dividas = new HashMap<String, H_Divida>();
	
    public void registraDivida(String credor, String cnpjCredor, double valor) {
      H_Divida divida = new H_Divida();
      divida.setTotal(valor);
      divida.setCredor(credor);
      divida.getCnpjCredor().setCnpjCredor(cnpjCredor);// agora usamos o getter e depois o setter
      dividas.put(cnpjCredor, divida);
    }
    
    public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		H_Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			B_Pagamento pagamento = new B_Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.getPagamentos().registra(pagamento);
		}
	}
  }