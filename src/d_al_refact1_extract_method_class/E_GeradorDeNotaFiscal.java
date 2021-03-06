package d_al_refact1_extract_method_class;

public class E_GeradorDeNotaFiscal {
	public B_NotaFiscal gera(C_Fatura fatura) {

		B_NotaFiscal nf = geraNF(fatura);
		
		enviaEmail(nf);
		
		//fazer a mesma coisa com salva no banco, linhas de 13 a 17
		//ir para F_GeradorDeNotaFiscal

		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
				"values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);

		return nf;
	}

	private void enviaEmail(B_NotaFiscal nf) {
		// envia email
		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "É com prazer que lhe avisamos que sua nota fiscal foi "
				+ "gerada no valor de " + nf.getValorLiquido() + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e faça o download.<br/><br/>";
		msgDoEmail += "Obrigado!";

		System.out.println(msgDoEmail);
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