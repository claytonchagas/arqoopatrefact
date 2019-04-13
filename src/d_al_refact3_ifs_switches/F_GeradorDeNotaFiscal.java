package d_al_refact3_ifs_switches;

public class F_GeradorDeNotaFiscal {

	public G_NotaFiscal gera(Fatura fatura) {

		G_NotaFiscal nf = geraNf(fatura);

		new EnviadorDeEmail().enviaEmail(nf);
		new NFDao().salvaNoBanco(nf);

		return nf;
	}

	private G_NotaFiscal geraNf(Fatura fatura) {

		G_NotaFiscal nf = new G_NotaFiscal(fatura.getValorMensal());
		return nf;
	}
}