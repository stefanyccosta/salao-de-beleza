package org.example.procedimentos;

import java.util.ArrayList;
import java.util.Scanner;

import org.example.pagamento.*;
import org.example.utilidades.Utils;

import static org.example.pagamento.FormaPagamento.obterFormaPagamento;

public class SalaoDeBeleza {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Procedimento> procedimentos = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("------Bem vindo ao Salão da Cabeleireira Leila!------");
        System.out.println("-----------------------------------------------------");
        System.out.println("########Qual procedimento deseja fazer hoje?#########");

        for (OpcaoMenu opcao : OpcaoMenu.values()) {
            if (opcao != OpcaoMenu.PAGAR && opcao != OpcaoMenu.SAIR) {
                System.out.printf(" | Opção %d - %s \n", opcao.getValor(), opcao.getDescricao());
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println(" | Opção 7 - Pagar              ");
        System.out.println(" | Opção 8 - Sair               ");

        int opcao = input.nextInt();
        OpcaoMenu opcaoMenu = obterOpcao(opcao);

        if (opcaoMenu != null) {
            switch (opcaoMenu) {
                case ESCOVAR:
                    Escovar escovar = new Escovar();
                    escovar.executar();
                    procedimentos.add(escovar);
                    break;
                case CORTAR:
                    Cortar cortar = new Cortar();
                    cortar.executar();
                    procedimentos.add(cortar);
                    break;
                case LAVAR:
                    Lavar lavar = new Lavar();
                    lavar.executar();
                    procedimentos.add(lavar);
                    break;
                case PENTEADO:
                    Penteado penteado = new Penteado();
                    penteado.executar();
                    procedimentos.add(penteado);
                    break;
                case HIDRATAR:
                    Hidratar hidratar = new Hidratar();
                    hidratar.executar();
                    procedimentos.add(hidratar);
                    break;
                case PINTAR:
                    Pintar pintar = new Pintar();
                    pintar.executar();
                    procedimentos.add(pintar);
                    break;
                case PAGAR:
                    System.out.println("O valor da sua compra é: " + Utils.formatarParaReais(precificacao(procedimentos)));
                    pagamento();
                    break;
                case SAIR:
                    System.exit(0);
                    break;
            }
        } else {
            System.out.println("Opção Inválida!");
            menu();
        }

        System.out.println("Deseja fazer outro procedimento? [1 - sim / 2 - não]");
        int op = input.nextInt();
        if (op == 1) {
            menu();
        } else {
            System.out.println("Ok, vamos te direcionar para a área de pagamento. Obrigada e volte sempre!");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("O valor da sua compra é: " + Utils.formatarParaReais(precificacao(procedimentos)));
            pagamento();
        }
    }

    public static OpcaoMenu obterOpcao(int valor) {
        for (OpcaoMenu opcao : OpcaoMenu.values()) {
            if (opcao.getValor() == valor) {
                return opcao;
            }
        }
        return null;
    }

    public static Double precificacao(ArrayList<Procedimento> procedimentos) {
        Double valorFinal = 0.0;
        for (Procedimento p : procedimentos) {
            valorFinal += p.getPreco();
        }
        return valorFinal;
    }


    public static void pagamento() {
        System.out.println("Qual será a forma de pagamento? [digite: 1-Dinheiro 2-Cartão de crédito 3-Cartão de débito ou 4-Pix]");
        int formaDePagamento = input.nextInt();
        FormaPagamento opcaoPagamento = obterFormaPagamento(formaDePagamento);

        if (opcaoPagamento != null) {
            switch (opcaoPagamento) {
                case DINHEIRO:
                    Dinheiro dinheiro = new Dinheiro();
                    dinheiro.executar(precificacao(procedimentos));
                    break;
                case CARTAO_CREDITO:
                    CartaoCredito cartaoCredito = new CartaoCredito();
                    cartaoCredito.executar(precificacaoComAcrescimo(procedimentos,3.0));
                    break;
                case CARTAO_DEBITO:
                    CartaoDebito cartaoDebito = new CartaoDebito();
                    cartaoDebito.executar(precificacao(procedimentos));
                    break;
                case PIX:
                    Pix pix = new Pix();
                    pix.executar(precificacao(procedimentos));
                    break;
                default:
                    System.out.println("Forma de pagamento inválida!");
                    pagamento();
                    break;
            }
        } else {
            System.out.println("Forma de pagamento inválida!");
            pagamento();
        }
    }

    public static Double precificacaoComAcrescimo(ArrayList<Procedimento> procedimentos, Double i) {
        double valor = 0.0;
        Double porcentagem =  i / 100.0;
        for (Procedimento p : procedimentos) {
            valor += p.getPreco();
        }
        double valorFinal= valor + (porcentagem * valor);

        return valorFinal;
    }

}