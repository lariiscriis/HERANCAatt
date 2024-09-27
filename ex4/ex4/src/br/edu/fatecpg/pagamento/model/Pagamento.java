package br.edu.fatecpg.pagamento.model;

public interface Pagamento {
	public double calcularPagamento();
	public String emitirRecibo();
}
