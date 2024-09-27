package br.edu.fatecpg.loja.model;

public class Faxineiro implements Funcionario{

	@Override
	public void baterPonto() {
		System.out.println("Ponto registrado!");		
	}
	public void solicitarMaterial() {
		System.out.println("Solicitou material...");		

	}
}
