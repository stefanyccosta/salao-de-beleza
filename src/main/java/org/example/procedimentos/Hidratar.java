package org.example.procedimentos;


import org.example.utilidades.Utils;

import java.util.Scanner;

public class Hidratar implements Procedimento {
    private Scanner input = new Scanner(System.in);
    private int opcao;

    @Override
    public void executar() {
        System.out.println("Qual mascara você deseja?[Digite: 1-nutrição, 2-reconstrução ou 3-hidratçaõ]");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                this.opcao = opcao;
                System.out.println("Ok, usando uma mascara de nutrição.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            case 2:
                this.opcao = opcao;
                System.out.println("Ok, usando uma mascara de reconstrução.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            case 3:
                this.opcao = opcao;
                System.out.println("Ok, usando uma mascara de hidratação.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    @Override
    public Double getPreco() {
        if (opcao == 1) {
            return 135.00;
        } else if (opcao == 2) {
            return 150.00;
        } else {
            return 140.00;
        }
    }
}
