package org.example.procedimentos;

public enum OpcaoMenu {
    ESCOVAR(1, "Escova modeladora"),
    CORTAR(2, "Corte"),
    LAVAR(3, "Lavar"),
    PENTEADO(4, "Penteado"),
    HIDRATAR(5, "Hidratação"),
    PINTAR(6, "Pintar"),
    PAGAR(7, "Pagar"),
    SAIR(8, "Sair");

    private final int valor;
    private final String descricao;

    OpcaoMenu(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
