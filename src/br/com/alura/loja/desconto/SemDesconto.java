package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    protected SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
