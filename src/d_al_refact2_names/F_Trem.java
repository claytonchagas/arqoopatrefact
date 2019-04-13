package d_al_refact2_names;

import java.util.List;

public class F_Trem {

	private List<B_Vagao> vagoes;
	private int capacidade;
//fazer o extract method das linhas 12 a 15
//ops, mas o nome da variavel eh igual ao do metodo
//dica para colocar inline: cursor em lugaresJaReservado Ctrl+1 e inline
//	int lugaresJaReservados = 0;
//	for(B_Vagao v : vagoes) {
//		lugaresJaReservados += v.reservados();
//	}
	public boolean podeReservar(int lugaresAReservar) {	
		int lugaresDisponiveis = capacidade - lugaresJaReservados();
		return lugaresDisponiveis > lugaresAReservar; 
	}

//novamente cursor em lugaresDisponiveis Ctrl+1 e inline
//ir para G_Trem
private int lugaresJaReservados() {
	int lugaresJaReservados = 0;
	for(B_Vagao v : vagoes) {
		lugaresJaReservados += v.reservados();
	}
	return lugaresJaReservados;
}
}