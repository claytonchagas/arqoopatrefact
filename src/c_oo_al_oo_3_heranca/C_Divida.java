package c_oo_al_oo_3_heranca;

import java.util.ArrayList;
import java.util.Calendar;

//classe Divida com muitas responsabilidade
//de difícil manutenção

//não queremos uma classe anêmica
//mas também não queremos uma classe com tantas responsabilidades
//:Separação de responsabilidades: muitas partes de Divida lida apenas com CNPJ do credor
@SuppressWarnings("unused")
public class C_Divida {
	private double total;
//	private double valorPago;
	private String credor;
	
	private B_Cnpj cnpjCredor = new B_Cnpj();
	
	public B_Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
	//OBS: não precisamos setter para CnpjCredor
	
//	private ArrayList<B_Pagamento> pagamentos = new ArrayList<B_Pagamento>();
	private D_Pagamentos pagamentos = new D_Pagamentos();
	private double valorPago;

	public String getCredor() {
		return this.credor;
	}
	
	public double getTotal() {
		return this.total;
	}
	
//	public double getValorPago() {
//		return this.valorPago;
//	}
	
//	private void paga(double valor) {
//		if (valor < 0) {
//			throw new IllegalArgumentException("Valor invalido para pagamento");
//		}
//		if (valor > 100) {
//			valor = valor - 8;
//		}
//		this.valorPago += valor;
//	}
	
//	public ArrayList<B_Pagamento> pagamentosAntesDe(Calendar data) {
//		ArrayList<B_Pagamento> pagamentosFiltrados = new ArrayList<B_Pagamento>();
//		for (B_Pagamento pagamento : this.pagamentos) {
//			if (pagamento.getData().before(data)) {
//				pagamentosFiltrados.add(pagamento);
//			}
//		}
//		return pagamentosFiltrados;
//	}
//	
//	public ArrayList<B_Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
//		ArrayList<B_Pagamento> pagamentosFiltrados = new ArrayList<B_Pagamento>();
//		for (B_Pagamento pagamento : this.pagamentos) {
//			if (pagamento.getValor() > valorMinimo) {
//				pagamentosFiltrados.add(pagamento);
//			}
//		}
//		return pagamentosFiltrados;
//	}
//	
//	public ArrayList<B_Pagamento> pagamentosDo(String cnpjPagador) {
//		ArrayList<B_Pagamento> pagamentosFiltrados = new ArrayList<B_Pagamento>();
//		for (B_Pagamento pagamento : this.pagamentos) {
//			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
//				pagamentosFiltrados.add(pagamento);
//			}
//		}
//		return pagamentosFiltrados;
//	}
	
//	public ArrayList<B_Pagamento> getPagamentos(){
//		return pagamentos;
//	}
	
	public D_Pagamentos getPagamentos(){
		return pagamentos;
	}

//	public void registra(B_Pagamento pagamento) {
//		this.pagamentos.add(pagamento);
//		paga(pagamento.getValor());
//	}

	public void setCredor(String credor) {
		this.credor = credor;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double valorAPagar() {
		return this.total - this.valorPago;
	}
}