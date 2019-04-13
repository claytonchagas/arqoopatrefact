package c_oo_al_oo_2_coesao;

public class G_Cnpj {
	private String valor;
	
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
		return 0;
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int primeiroDigitoVerificador() {
		return 0;
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int segundoDigitoCorreto() {
		return 0;
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	private int segundoDigitoVerificador() {
		return 0;
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String novoValor) {
		this.valor = novoValor;
	}

}
