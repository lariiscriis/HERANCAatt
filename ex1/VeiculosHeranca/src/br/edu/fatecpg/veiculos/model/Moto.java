package br.edu.fatecpg.veiculos.model;

public class Moto extends Veiculo{
	private String donoMoto;
	private int tamanhoMoto;
	
	public String getDonoMoto(){
        return this.donoMoto;
    }

	public void setDonoMoto(String donoMoto){
        this.donoMoto = donoMoto;
	}
	
	public int getTamanhoMoto(){
        return this.tamanhoMoto;
    }

	public void setTamanhoMoto(int tamanhoMoto){
        this.tamanhoMoto = tamanhoMoto;
	}
	
	public Moto(String mod, String mrc, int ano, String cor, String Dmoto, int tm)
	{ 
	super(mod, mrc, ano, cor);
	this.donoMoto = Dmoto;
	this.tamanhoMoto = tm;	
	}
	
	public void empinar(){
		System.out.println("Empinou!!!");
	}
	public void buzinar() {
		System.out.println("Buzinei!!!");
	}
	

}
