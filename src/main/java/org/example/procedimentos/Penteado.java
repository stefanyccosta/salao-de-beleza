package org.example.procedimentos;

import org.example.utilidades.Utils;

import java.util.Scanner;

public class Penteado implements Procedimento {
    private Scanner input = new Scanner(System.in);
    private int penteado;

    @Override
    public void executar() {
        System.out.println("Qual penteado deseja fazer? [Digite: 1-Solto, 2- Semi-preso ou 3- Preso]");
        int penteado = input.nextInt();
        switch (penteado) {
            case 1:
                this.penteado = penteado;
                System.out.println("Ok, fazendo um penteado solto");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            case 2:
                this.penteado = penteado;
                System.out.println("Ok, fazendo um penteado semi-preso");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            case 3:
                this.penteado = penteado;
                System.out.println("Ok, fazendo um penteado preso.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

    @Override
    public Double getPreco() {
        if (penteado == 1) {
            return 80.00;
        } else if (penteado == 2) {
            return 100.00;
        } else {
            return 110.00;
        }

    }
}
