package com.flaviosudre.cursomc.Testes;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa  convidado    = new Pessoa(50.5);
		
		Arroz  ingrediente1  = new Arroz(0.2);
		Feijao  ingrediente2 = new Feijao(0.1);
		Comida  ingrediente3 = new Feijao(5); 
		Sorvete sobremesa  = new Sorvete(0.4);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}

}
