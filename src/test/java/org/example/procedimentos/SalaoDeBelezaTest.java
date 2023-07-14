package org.example.procedimentos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SalaoDeBelezaTest {

    @Test
    void testPrecificacao() {
        ArrayList<Procedimento> procedimentos = new ArrayList<>();
        Procedimento procedimento1 = criaProcedimentoFake(10.0);
        Procedimento procedimento2 = criaProcedimentoFake(15.0);
        procedimentos.add(procedimento1);
        procedimentos.add(procedimento2);

        Double valorFinal = SalaoDeBeleza.precificacao(procedimentos);

        assertEquals(25.0, valorFinal);
    }



    @Test
    void testPrecificacaoComAcrescimo() {
        ArrayList<Procedimento> procedimentos = new ArrayList<>();
        Procedimento procedimento1 = criaProcedimentoFake(10.0);
        Procedimento procedimento2 = criaProcedimentoFake(15.0);
        Procedimento procedimento3 = criaProcedimentoFake(75.0);

        procedimentos.add(procedimento1);
        procedimentos.add(procedimento2);
        procedimentos.add(procedimento3);

        assertEquals(103.0, SalaoDeBeleza.precificacaoComAcrescimo(procedimentos, 3.0));
        assertEquals(150.0, SalaoDeBeleza.precificacaoComAcrescimo(procedimentos, 50.0));
        assertEquals(115.0, SalaoDeBeleza.precificacaoComAcrescimo(procedimentos, 15.0));
    }

    private Procedimento criaProcedimentoFake(Double preco) {
        return new Procedimento() {
            @Override
            public void executar() {
                //Não importa para esse teste
            }

            @Override
            public Double getPreco() {
                return preco;
            }
        };
    }
}