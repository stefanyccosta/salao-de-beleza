package org.example.procedimentos;


import org.example.utilidades.Utils;

import java.util.Scanner;

public class Cortar implements Procedimento {
    private Scanner input = new Scanner(System.in);
    private int comprimento;
    private int tamanhoCabelo;
    private int opcao;
    private int respostaMedio;
    private int respostaLongo;


    @Override
    public void executar() {
        System.out.println("Você gostaria de fazer um corte específico ou apenas tirar as pontas?[digite: 1- corte específico ou 2-cortar as pontas]");
        int opcao = input.nextInt();
        if (opcao == 1) {
            this.opcao = opcao;
            System.out.println("Qual corte gostaria de fazer?");
            String corte = input.next();
            System.out.println("Qual o tamanho do seu cabelo?[digite: 1-Curto, 2-Médio ou 3-Longo]");
            int tamanhoCabelo = input.nextInt();

            switch (tamanhoCabelo) {
                case 1:
                    this.tamanhoCabelo = tamanhoCabelo;
                    System.out.println("Ok, cortando seu cabelo no estilo " + corte + " no comprimento curto.");
                    System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                    break;
                case 2:
                    this.tamanhoCabelo = tamanhoCabelo;
                    System.out.println("Qual o comprimento que deseja cortar seu cabelo? [digite: 1-curto ou 2-médio]");
                    int respostaMedio = input.nextInt();
                    this.respostaMedio = respostaMedio;
                    if (respostaMedio == 1) {
                        System.out.println("Ok, cortando seu cabelo no estilo " + corte + " no comprimento curto.");
                        System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                    } else {
                        System.out.println("Ok, cortando seu cabelo no estilo " + corte + " no comprimento médio.");
                        System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                    }
                    break;
                case 3:
                    this.tamanhoCabelo = tamanhoCabelo;
                    System.out.println("Qual o comprimento que deseja cortar seu cabelo? [digite: 1-curto, 2-médio ou 3-longo]");
                    int respostaLongo = input.nextInt();
                    this.respostaLongo = respostaLongo;
                    if (respostaLongo == 1) {
                        System.out.println("Ok, cortando seu cabelo no estilo " + corte + " no comprimento curto.");
                        System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                    } else if (respostaLongo == 2) {
                        System.out.println("Ok, cortando seu cabelo no estilo " + corte + " no comprimento médio.");
                        System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                    } else {
                        System.out.println("Ok, cortando seu cabelo no estilo " + corte + " no comprimento longo.");
                        System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Ok, cortando somente as pontas.");
            System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
        }
    }

    @Override
    public Double getPreco() {
        if (opcao == 1 && tamanhoCabelo == 1) {
            return 55.00;
        } else if (opcao == 1 && tamanhoCabelo == 2 && respostaMedio == 1) {
            return 65.00;
        } else if (opcao == 1 && tamanhoCabelo == 2 && respostaMedio == 2) {
            return 60.00;
        } else if (opcao == 1 && tamanhoCabelo == 3 && respostaLongo == 1) {
            return 100.00;
        } else if (opcao == 1 && tamanhoCabelo == 3 && respostaLongo == 2) {
            return 85.00;
        } else if (opcao == 1 && tamanhoCabelo == 3 && respostaLongo == 3) {
            return 77.00;
        } else {
            return 50.00;
        }
    }

}
