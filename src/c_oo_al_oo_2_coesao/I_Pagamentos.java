package c_oo_al_oo_2_coesao;

import java.util.ArrayList;
import java.util.Calendar;

@SuppressWarnings("serial")
public class I_Pagamentos extends ArrayList<B_Pagamento>{
	private double valorPago;
	
	public double getValorPago() {
		return this.valorPago;
	}
	
	public void registra(B_Pagamento pagamento) {
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
	
	public ArrayList<B_Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<B_Pagamento> pagamentosFiltrados = new ArrayList<B_Pagamento>();
//		for (B_Pagamento pagamento : this.pagamentos) {
		for (B_Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<B_Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<B_Pagamento> pagamentosFiltrados = new ArrayList<B_Pagamento>();
		for (B_Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<B_Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<B_Pagamento> pagamentosFiltrados = new ArrayList<B_Pagamento>();
		for (B_Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
}
