package c_oo_al_oo_3_heranca;

import java.util.Calendar;

public class A_Pagamento {
	private String pagador;
    private String cnpjPagador;
    private double valor;

    public String getPagador() {
      return this.pagador;
    }
    public void setPagador(String pagador) {
      this.pagador = pagador;
    }
    public String getCnpjPagador() {
      return this.cnpjPagador;
    }
    public void setCnpjPagador(String cnpjPagador) {
      this.cnpjPagador = cnpjPagador;
    }
    public double getValor() {
      return this.valor;
    }
    public void setValor(double valor) {
      this.valor = valor;
    }
	public Calendar getData() {
		// TODO Auto-generated method stub
		return null;
	}
}