package d_al_refact1_extract_method_class;

public class G_GeradorDeNotaFiscal {
	public B_NotaFiscal gera(C_Fatura fatura) {

		//para consertar eu atribuo os retornos dos metodos para as respectivas classes criadas
		B_NotaFiscal nf = geraNF(fatura);
//		enviaEmail(nf);
//		salvaNoBanco(nf);
//		new I_EnviadorDeEmail().enviaEmail(nf);
//		new H_NFDao().salvaNoBanco(nf);
		
		return nf;
		//Alem disso, o eclipse tambem pode ajudar voce no refactor de extract classes
	}

	private B_NotaFiscal geraNF(C_Fatura fatura) {
		// calcula valor do imposto
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