package org.example.pagamento;

public class Pix implements Pagamento {
    @Override
    public void executar(Double valorFinal) {
        System.out.println("A nossa chave Pix é cabeleireiraleila@gmail.com");
        System.out.println("Ápos efetuar o pagamento, mostre o comprovante para a recepcionista!");
        System.out.println("Pagamento efetuado com sucesso!");
    }
}
