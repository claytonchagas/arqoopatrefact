package d_al_refact2_names;

import java.util.List;

//na variavel r "Ctrl+1 rename" para alterar em todos os locais
//mudar r para lugaresJaReservados
//alem disso, cada variavel deve conter apenas uma informacao
//isso nao ocorre em lugaresJaReservados por causa da linha 23
//que na verdade calcula a quantidade de lugares livres
//podemos alterar o return para melhorar isso...ir para D_Trem
public class C_Trem {

	private List<B_Vagao> vagoes;
	private int capacidade;
	
	public boolean disp(int reservas) {
		
		int lugaresJaReservados = 0;
		for(B_Vagao v : vagoes) {
			lugaresJaReservados += v.reservados();
		}
		
		lugaresJaReservados = capacidade - lugaresJaReservados;
		return lugaresJaReservados > reservas; 
	}
}