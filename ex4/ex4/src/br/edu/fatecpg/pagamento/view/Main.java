package br.edu.fatecpg.pagamento.view;

import br.edu.fatecpg.pagamento.model.Pagamento;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;
import br.edu.fatecpg.pagamento.model.PagamentoDinheiro;

public class Main {
    public static void main(String[] args) {
        double valor = 100.0;

        Pagamento pagamentoCartao = new PagamentoCartao(valor);
        Pagamento pagamentoDinheiro = new PagamentoDinheiro(valor);

        System.out.println(pagamentoCartao.emitirRecibo());

        System.out.println(pagamentoDinheiro.emitirRecibo());
    }
}
