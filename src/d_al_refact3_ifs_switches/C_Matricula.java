package d_al_refact3_ifs_switches;

import java.util.Calendar;

public class C_Matricula {

	private boolean trial;
	private Calendar expiracao;
	
	public C_Matricula(boolean ehTrial, Calendar expiracao) {
		this.trial = ehTrial;
		this.expiracao = expiracao;
	}
	
	public boolean isTrial() {
		return trial;
	}
	
	public Calendar getExpiracao() {
		return expiracao;
	}

	public boolean estaValida() {
		return !this.isTrial() && this.getExpiracao().after(Calendar.getInstance());
	}
}