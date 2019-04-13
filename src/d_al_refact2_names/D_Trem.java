package d_al_refact2_names;

import java.util.List;

public class D_Trem {

	private List<B_Vagao> vagoes;
	private int capacidade;
	
	public boolean disp(int reservas) {
		
		int lugaresJaReservados = 0;
		for(B_Vagao v : vagoes) {
			lugaresJaReservados += v.reservados();
		}

		return capacidade - lugaresJaReservados > reservas; 
//mas pode ficar melhor ainda se criarmos uma variavel para isso
//selecione o trecho "capacidade - lugaresJaReservados" e
//Ctrl+1 "extract to local variable", ir para E_Trem
//fica mais legivel do que utilizar a operacao inline
	}
}