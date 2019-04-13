package c_oo_al_oo_2_coesao;

public class E_Cnpj {
	private String cnpjCredor;
	
	public boolean cnpjValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	private int primeiroDigitoCorretoParaCnpj() {
		return 0;
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		return 0;
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int segundoDigitoCorretoParaCnpj() {
		return 0;
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	private int segundoDigitoVerificadorDoCnpj() {
		return 0;
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	public String getCnpjCredor() {
		return this.cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

}
