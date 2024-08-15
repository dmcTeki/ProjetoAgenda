package br.ufpb.dcx.davi.agenda;

import java.util.HashMap;
import java.io.IOException;
import java.util.Map;

public class GravadorDeDados {

    public static final String ARQUIVO_CONTATO = "contatos.dat";

    public HashMap<String, Contato> recuperarContatos() throws IOException{}
    public void salvaContatos(Map<String, Contato> contatos) throws IOException{}
}
