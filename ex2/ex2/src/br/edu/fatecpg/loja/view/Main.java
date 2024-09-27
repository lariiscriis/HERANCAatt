package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Funcionario;
import br.edu.fatecpg.loja.model.Gerente;
import br.edu.fatecpg.loja.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		//teste funcionario, não da pra instanciar interface
		//Funcionario func = new Funcionario();
		
		//vendedor, não pode instanciar classes abstratas
		//Vendedor ven = new Vendedor();
		
		//faxineiro
		Faxineiro faxi = new Faxineiro();
		faxi.solicitarMaterial();
		faxi.baterPonto();
		//gerente
		Gerente ger = new Gerente();
		ger.baterPonto();
		ger.fecharCaixa();
		ger.realizarVenda();
		
	}

}
