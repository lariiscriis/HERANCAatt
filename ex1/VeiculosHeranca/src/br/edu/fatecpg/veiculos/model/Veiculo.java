package br.edu.fatecpg.veiculos.model;
//superclasse
public class Veiculo {
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	
	public String getModelo(){
        return this.modelo;
    }

	public void setModelo(String modelo){
        this.modelo = modelo;
	}
	
	public String getMarca(){
        return this.marca;
    }

	public void setMarca(String marca){
        this.marca = marca;
	}
	
	public int getAno(){
        return this.ano;
    }

	public void setAno(int ano){
        this.ano = ano;
	}
	
	public String getCor(){
        return this.cor;
    }

	public void setCor(String cor){
        this.cor = cor;
	}
	//metodo construtor, sempre ter o nome da classe
	public Veiculo(String mod, String mrc, int ano, String  cor) {
		this.modelo = mod;
		this.marca = mrc;
		this.ano = ano;
		this.cor = cor;
	}
	
	//metodos principais
	public void ligar() {
		System.out.println("Ligando...");
		System.out.println("Ligado");
	}
	
	public void desligar() {
		System.out.println("Desligado");
	}
	
	
}
