package br.edu.fatecpg.loja.model;

public abstract class Vendedor implements Funcionario{
	
	public void realizarVenda() {
		System.out.println("Vendeu!");		
	}

	@Override
	public void baterPonto() {
		System.out.println("Ponto registrado!");		
		
	}
}
