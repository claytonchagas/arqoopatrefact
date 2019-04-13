package d_al_refact1_extract_method_class;

public class H_NFDao {
	public void salvaNoBanco(B_NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
				"values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);
	}
}
