package br.edu.fatecpg.pagamento.model;

public class PagamentoDinheiro implements Pagamento {
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor - (valor * 0.10);
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento em Dinheiro\n" +
               "Valor original: R$ " + valor + "\n" +
               "Desconto de 10%: R$ " + (valor * 0.10) + "\n" +
               "Total a pagar: R$ " + calcularPagamento() + "\n";
    }
}
