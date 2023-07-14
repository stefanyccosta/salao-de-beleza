package org.example.procedimentos;


import org.example.utilidades.Utils;

import java.util.Scanner;

public class Pintar implements Procedimento {
    private Scanner input = new Scanner(System.in);
    private int opcao;

    @Override
    public void executar() {
        System.out.println("Você trouxe a tinta  ou irá usar a mistura do salão?[digite: 1-trouxe a tinta ou 2-usar a mistura do salão]");
        int opcao = input.nextInt();
        this.opcao = opcao;
        if(opcao==2) {
            System.out.println("Qual a cor que Deseja pintar!");
            String cor = input.next();
            System.out.println("Ok, pintando seu cabelo de " + cor + ".");
            System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
        } else{
            System.out.println("Ok, pintando seu cabelo com a tinta que você trouxe!");
            System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
        }
    }

    @Override
    public Double getPreco() {
        if (opcao == 2) {
            return 110.00;
        } else {
            return 80.00;

        }
    }

}
