package org.example.pagamento;

import java.util.Scanner;

public class CartaoDebito implements Pagamento {
    private Scanner input = new Scanner(System.in);

    @Override
    public void executar(Double valorFinal) {
        System.out.println("Aproximar ou Inserir?[digite: 1-Aproximar ou 2-Inserir]");
        int formaCartaoDeb = input.nextInt();
        if (formaCartaoDeb == 1) {
            System.out.println("Aproxime seu cartão e digite a senha");
            int senha = input.nextInt();
            System.out.println("Pagamento feito com sucesso!");
        } else {
            System.out.println("Insira o cartão e digite a senha");
            int senha = input.nextInt();
            System.out.println("Pagamento efetuado com sucesso!");
        }
    }
}
