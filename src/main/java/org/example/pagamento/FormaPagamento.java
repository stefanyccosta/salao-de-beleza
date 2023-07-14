package org.example.pagamento;

public enum FormaPagamento {

    DINHEIRO(1),
    CARTAO_CREDITO(2),
    CARTAO_DEBITO(3),
    PIX(4);

    private final int valor;

    FormaPagamento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static FormaPagamento obterFormaPagamento(int valor) {
        for (FormaPagamento formaPagamento : values()) {
            if (formaPagamento.getValor() == valor) {
                return formaPagamento;
            }
        }
        return null;
    }
}

