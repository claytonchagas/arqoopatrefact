package c_oo_al_oo_1_overview;

import java.util.HashMap;

public class F_BalancoEmpresa {
    private HashMap<String, B_Divida> dividas = new HashMap<String, B_Divida>();

    public void registraDivida(String credor, String cnpjCredor, double valor) {
      B_Divida divida = new B_Divida();
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
    
    public void pagaDivida(String cnpjCredor, double valor) {
        B_Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
          if (valor > 100) {
            valor = valor - 8;
          }
          divida.setValorPago(divida.getValorPago() + valor);
        }
      }
  }