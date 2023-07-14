package org.example.pagamento;


import org.example.procedimentos.SalaoDeBeleza;
import org.example.utilidades.Utils;

import java.util.Scanner;


public class Dinheiro implements Pagamento {
    private Scanner input = new Scanner(System.in);

    @Override
    public void executar(Double valorFinal) {
        System.out.println("Por favor, insira o pagamento em dinheiro:");
        Double pagamento = input.nextDouble();
        Double troco = pagamento - valorFinal;

        if (pagamento > valorFinal) {
            System.out.println("Pagamento realizado com sucesso, seu troco é de: " + Utils.formatarParaReais(troco));
        } else if (valorFinal > pagamento) {
            System.out.println("O valor inserido não é suficinte para efetuar o pagamento, por favor insera o valor correto!");
           SalaoDeBeleza.pagamento();
        } else {
            System.out.println("Pagamento efetuado com sucesso!");
        }
    }
}