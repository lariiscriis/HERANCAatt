package br.edu.fatecpg.pagamento.model;

	public class PagamentoCartao implements Pagamento {
	    private double valor;

	    public PagamentoCartao(double valor) {
	        this.valor = valor;
	    }

	    @Override
	    public double calcularPagamento() {
	        return valor + (valor * 0.05);
	    }

	    @Override
	    public String emitirRecibo() {
	        return "Pagamento com Cartão\n" +
	               "Valor original: R$ " + valor + "\n" +
	               "Taxa de 5%: R$ " + (valor * 0.05) + "\n" +
	               "Total a pagar: R$ " + calcularPagamento() + "\n";
	    }
	}