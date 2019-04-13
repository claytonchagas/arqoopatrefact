package d_al_refact3_ifs_switches;

public class NFDao {
	public void salvaNoBanco(B_NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}
	
	public void salvaNoBanco(G_NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}

}
