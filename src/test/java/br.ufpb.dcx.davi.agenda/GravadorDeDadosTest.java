package br.ufpb.dcx.davi.agenda;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class GravadorDeDadosTest {
    @Test
    public void testaGravacao() throws IOException {
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATO);
        if(arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATO);
        assertFalse(arquivo.exists());
        HashMap<String, Contato> contatosMap = new HashMap<>();
        contatosMap.put("Davi", new Contato("Davi", 3, 3));
        gravadorDeDados.salvaContatos(contatosMap);
        assertTrue(arquivo.exists());
        arquivo.delete();
    }
    public void testaRecuperacao() throws IOException{
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATO);
        if(arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATO);
        assertFalse(arquivo.exists());
        HashMap<String, Contato> contatosMap = new HashMap<>();
        contatosMap.put("Davi", new Contato("Davi", 3, 3));
        gravadorDeDados.salvaContatos(contatosMap);
        assertTrue(arquivo.exists());
        HashMap<String, Contato> contatosRecuperados = gravadorDeDados.recuperarContatos();
        Contato c1 = contatosRecuperados.get("Davi");
        assertEquals("Davi", c1.getNome())  ;
        assertEquals(3, c1.getDiaAniversario());
        assertEquals(3, c1.getMesAniversario());
        arquivo.delete();
    }


}
