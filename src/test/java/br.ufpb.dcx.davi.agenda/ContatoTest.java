package br.ufpb.dcx.davi.agenda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatoTest {

    @Test
    public void testaConstrutor(){
        Contato c1 = new Contato("Davi", 03, 03);
        assertEquals("Davi", c1.getNome());
        assertEquals(03, c1.getDiaAniversario());
        assertEquals(03, c1.getDiaAniversario());
        System.out.println(c1.toString());
    }
}
