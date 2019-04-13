package c_oo_al_oo_1_overview;
//Dados (valor pago da dívida) e comportamento (pagamento da dívida)
//estão separados, classe Divida anterior é burra
//somente armazena valores
public class G_Divida {
    private double total;
    private double valorPago;
    private String credor;
    private String cnpjCredor;

    public double getTotal() {
      return this.total;
    }
    public void setTotal(double total) {
      this.total = total;
    }
    public double getValorPago() {
      return this.valorPago;
    }
    public void setValorPago(double valorPago) {
      this.valorPago = valorPago;
    }
    public String getCredor() {
      return this.credor;
    }
    public void setCredor(String credor) {
      this.credor = credor;
    }
    public String getCnpjCredor() {
      return this.cnpjCredor;
    }
    public void setCnpjCredor(String cnpjCredor) {
      this.cnpjCredor = cnpjCredor;
    }
    
    public void paga(double valor) {
        if (valor > 100) {
          valor = valor - 8;
        }
        this.valorPago += valor;
      }
  }
