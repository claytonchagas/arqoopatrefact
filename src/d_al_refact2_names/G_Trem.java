package d_al_refact2_names;

import java.util.List;

public class G_Trem {

	private List<B_Vagao> vagoes;
	private int capacidade;

	public boolean podeReservar(int lugaresAReservar) {	
		return capacidade - lugaresJaReservados() > lugaresAReservar; 
	}
//ficou melhor ou voce prefere a versao anterior mais semantica
//nem sempre o metodo menor eh o mais claro e facil de fazer manutencao
//o bom metodo nao eh o menor, mas o mais facil de ser lido	

//dar um nome melhor: vagao no lugar de v
private int lugaresJaReservados() {
	int lugaresJaReservados = 0;
//	for(B_Vagao v : vagoes) {
	for(B_Vagao vagao : vagoes) {
		lugaresJaReservados += vagao.reservados();
	}
	return lugaresJaReservados;
}
}