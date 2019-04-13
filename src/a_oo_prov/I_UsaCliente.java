package a_oo_prov;
//Construtores
public class I_UsaCliente {
	public static void main(String[] args) {
		H_Cliente c1 = new H_Cliente("Maria");
		H_Cliente c2 = new H_Cliente("Joao");
		System.out.println(c1.nome);
		System.out.println(c2.nome);
	}
}