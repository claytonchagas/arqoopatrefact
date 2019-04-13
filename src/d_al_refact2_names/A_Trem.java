package d_al_refact2_names;

import java.util.List;

//classe com logica dificil de entender de forma rapida
//os nomes sao muito pouco intuitivos
//quer saber se existe a quantidade reservas de assentos disponiveis no meu trem
//fazendo um looping dentro de cada vagao, pegando quanto foi reservado
//e batendo com a capacidade do trem
//no fim compara r (assentos livres no trem) e ve se eh maior do que reserva (ufa!)
public class A_Trem {

	private List<B_Vagao> vagoes;
	private int capacidade;
	
	public boolean disp(int reservas) {
		
		int r = 0;
		for(B_Vagao v : vagoes) {
			r += v.reservados();
		}
		
		r = capacidade - r;
		return r > reservas; 
	}
	
//nomes adequados facilitam muito a leitura e manutencao dos codigos
//ir para C_Trem para fazer a refatoracao
}