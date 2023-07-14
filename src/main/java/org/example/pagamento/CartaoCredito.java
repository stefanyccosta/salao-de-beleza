package org.example.pagamento;


import java.util.Scanner;
import org.example.utilidades.Utils;

public class CartaoCredito implements Pagamento {
    private Scanner input = new Scanner(System.in);

    @Override
    public void executar(Double valorFinal) {
        System.out.println("Digite o número de  parcelas que você deseja dividir [1 a 6 ]");
        int numParcelas = input.nextInt();
        Double parcelas = valorFinal / numParcelas;
        System.out.println("Você optou por dividir em " + numParcelas + " vezes. O valor de cada parcela será de: " + Utils.formatarParaReais(parcelas));

        System.out.println("Aproximar ou Inserir?[digite: 1-Aproximar ou 2-Inserir]");
        int formaCartao = input.nextInt();
        if (formaCartao == 1) {
            System.out.println("Aproxime seu cartão");
            System.out.println("Pagamento feito com sucesso!");
        } else {
            System.out.println("Insira o cartão e digite a senha");
            input.nextInt();
            System.out.println("Pagamento efetuado com sucesso!");
        }
    }
}
