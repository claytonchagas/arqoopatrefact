package d_al_refact3_ifs_switches;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class D_TestaMatricula {
	public static void main(String[] args) {
		C_Matricula matricula = new C_Matricula(false, new GregorianCalendar(2019, Calendar.MAY, 13));
		
//		if (!matricula.isTrial() && matricula.getExpiracao().after(Calendar.getInstance())) {
//			System.out.println("Usuario ilimitado!");
//		}
		
		if (matricula.estaValida()) {
			System.out.println("Usuario ilimitado!");
		}
		
//		if (funcionario.getCargo() == DESENVOLVEDOR) {
//			double salario = 1000;
//		}
//		
//		if (funcionario.getCargo() == GERENTE) {
//			double salario = 10000;
//		}

	}
}
