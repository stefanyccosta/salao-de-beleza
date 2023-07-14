package org.example.procedimentos;

import org.example.utilidades.Utils;

import java.util.Scanner;

public class Lavar implements Procedimento {
    Scanner input = new Scanner(System.in);
    @Override
    public void executar() {
        System.out.println("Qual a temperatura da água você deseja lavar o seu cabelo?[ Opção 1-Fria ou 2-Morna]");
        int temp = input.nextInt();
        switch (temp){
            case 1:
                System.out.println("Lavando seu cabelo com aguá fria.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            case 2:
                System.out.println("Lavando seu cabelo com água morna.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    @Override
    public Double getPreco() {
        return 50.00;
    }
}
