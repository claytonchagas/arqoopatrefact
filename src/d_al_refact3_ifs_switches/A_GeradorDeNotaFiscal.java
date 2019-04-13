package d_al_refact3_ifs_switches;

public class A_GeradorDeNotaFiscal {

	public B_NotaFiscal gera(Fatura fatura) {

		B_NotaFiscal nf = geraNf(fatura);

		new EnviadorDeEmail().enviaEmail(nf);
		new NFDao().salvaNoBanco(nf);

		return nf;
	}

	//if algoritmico ou matematico, no maximo esconder como em geraNf
	//mas, quem deve calcular o imposto deve ser a Nf
	//este trecho quebra o encapsulamento do código
	//levar linhas de 20 a 30 para dentro de G_NotaFiscal->F_GeradorDeNotaFiscal
	private B_NotaFiscal geraNf(Fatura fatura) {
		double valor = fatura.getValorMensal();
		double imposto = 0;
		if(valor < 200) {
			imposto = valor * 0.03;
		}
		else if(valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		}
		else {
			imposto = valor * 0.07;
		}
		
		B_NotaFiscal nf = new B_NotaFiscal(valor, imposto);
		return nf;
	}
}