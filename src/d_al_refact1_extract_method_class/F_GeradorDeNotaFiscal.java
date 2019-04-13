package d_al_refact1_extract_method_class;

public class F_GeradorDeNotaFiscal {
	public B_NotaFiscal gera(C_Fatura fatura) {

		B_NotaFiscal nf = geraNF(fatura);
		
		enviaEmail(nf);

		salvaNoBanco(nf);
		
		//assim a boa pratica eh quebrar metodos longos em metodos privados menores

		return nf;
	}
	
	//mas temos outro problema, GeradorDeNotaFiscal so deveria tomar conta de coisas afetas a Nota Fiscal
	//e nao mexer como banco, e-mail, etc...quando isso ocorre, o melhor é extrairmos estas regras para outras classes
	//criar a classe NFDao: Dao eh uma classe que acessa banco de dados
	//criar a classe EnviadorDeEmail e extrair os dois trechos de codigos
	//fica no final com G_GeradorDeNotaFiscal
	private void salvaNoBanco(B_NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
				"values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);
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