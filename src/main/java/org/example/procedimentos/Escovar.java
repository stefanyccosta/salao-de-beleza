package org.example.procedimentos;


import org.example.utilidades.Utils;

import java.util.Scanner;

public class Escovar implements Procedimento {
    private Scanner input = new Scanner(System.in);
    private int modelo;

    @Override
    public void executar() {
        System.out.println("Qual modelo de escova deseja fazer? [ digite: 1-modeladora ou 2-normal]");
        int modelo = input.nextInt();
        switch (modelo){
            case 1:
                this.modelo = modelo;
                System.out.println("Ok, fazendo uma escova modeladora.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            case 2:
                this.modelo = modelo;
                System.out.println("Ok, fazendo uma escova normal.");
                System.out.println("O valor deste procedimento é: " + Utils.formatarParaReais(getPreco()));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    @Override
    public Double getPreco() {
        if(modelo == 1) {
            return 85.00;
        } else {
            return 70.00;
        }
    }
}
