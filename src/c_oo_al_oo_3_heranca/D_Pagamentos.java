package c_oo_al_oo_3_heranca;

import java.util.ArrayList;
import java.util.Calendar;

@SuppressWarnings("serial")
public class D_Pagamentos extends ArrayList<A_Pagamento>{
	private double valorPago;
	
	public double getValorPago() {
		return this.valorPago;
	}
	
	public void registra(A_Pagamento pagamento) {
		this.add(pagamento);
		paga(pagamento.getValor());
	}
	
	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}
	
	public ArrayList<A_Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<A_Pagamento> pagamentosFiltrados = new ArrayList<A_Pagamento>();
//		for (B_Pagamento pagamento : this.pagamentos) {
		for (A_Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<A_Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<A_Pagamento> pagamentosFiltrados = new ArrayList<A_Pagamento>();
		for (A_Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<A_Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<A_Pagamento> pagamentosFiltrados = new ArrayList<A_Pagamento>();
		for (A_Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
}
