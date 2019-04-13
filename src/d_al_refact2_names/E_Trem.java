package d_al_refact2_names;

import java.util.List;

public class E_Trem {

	private List<B_Vagao> vagoes;
	private int capacidade;
	
	public boolean disp(int reservas) {
		
		int lugaresJaReservados = 0;
		for(B_Vagao v : vagoes) {
			lugaresJaReservados += v.reservados();
		}

		int lugaresDisponiveis = capacidade - lugaresJaReservados;
		return lugaresDisponiveis > reservas; 
	}
//alterar disp para podeReservar e reservas para lugaresAReservar
//F_Trem
}