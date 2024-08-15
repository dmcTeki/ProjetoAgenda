package br.ufpb.dcx.davi.agenda;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaAgendaTest {
    @Test
    public void testaCadastroPesquisaRemocao(){
        SistemaAgenda sistema = new SistemaAgenda ();
        Collection<Contato> contatosAchados = sistema.pesquisaAniversariantes(20,8);
        assertTrue(contatosAchados.size()==0);
        sistema.CadastraContato("Maria",20,8);
        sistema.CadastraContato("José",20,8);
        contatosAchados= sistema.pesquisaAniversariantes(20,8);
        assertEquals(2,contatosAchados.size());
        Contato maria = new Contato("Maria",20,8);
        assertTrue(contatosAchados.contains(maria));
        Contato jose = new Contato("Jose",20,8);
        assertTrue(contatosAchados.contains(jose));

        try {
            sistema.removeContato("Jose");
        } catch (ContatoInexistenteException e) {x
            fail("deu erro");
        }
    }
}
