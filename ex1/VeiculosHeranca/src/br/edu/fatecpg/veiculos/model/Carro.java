package br.edu.fatecpg.veiculos.model;

//subclasse
//Crie uma interface chamada "OperacaoMatematica". Crie também 4 métodos das operações
//básicas: soma, subtração, multiplicação e divisão implemente na classe Calculadora.

public class Carro extends Veiculo {
	private int num_passageiros;
	private String tipo;
	
	public int getNumPassageiros(){
        return this.num_passageiros;
    }

	public void setNumPassageiros(int num_passageiros){
        this.num_passageiros = num_passageiros;
	}
	
	public String getTipo(){
        return this.tipo;
    }

	public void setTipo(String tipo){
        this.tipo = tipo;
	}
	
	public Carro(String mod, String mrc, int ano, String cor, int num_pass, String tipo) {
		//recebendo os valores da classe pai veiculo
		super(mod, mrc, ano, cor);
		this.num_passageiros = num_pass;
		this.tipo = tipo;
		
	}
	
	public void acelerar() {
		System.out.println("Acelerou");
	}
	public void ligarAr() {
		System.out.println("Ar ligado");
	}
	
}
