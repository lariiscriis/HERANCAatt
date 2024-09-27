package br.edu.fatecpg.veiculos.model;

public class Caminhao extends Veiculo{
	private int carga;
	private String tipoCarga;
	
	public int getCarga(){
        return this.carga;
    }

	public void setCarga(int carga){
        this.carga = carga;
	}
	
	public String getTipoCarga(){
        return this.tipoCarga;
    }

	public void setTipoCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
	}
	
	public Caminhao(String mod, String mrc, int ano, String cor, int carga, String tCarga) {
		super(mod, mrc, ano, cor);
		this.carga = carga;
		this.tipoCarga = tCarga;
	}
	
	public void buzinarCaminhao() {
		System.out.println("Buzinei!!!");
	}
	
	public void pegarCarga() {
		System.out.println("Carga Adicionada!!!");
	}
}

