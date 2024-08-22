package br.ufpb.dcx.davi.agenda;

import java.io.IOException;
import java.util.Collection;

public interface SistemaAgendaInterface {

    public boolean CadastraContato(String nome, int dia, int mes);
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes);
    public boolean removeContato(String nome) throws ContatoInexistenteException;
    public void salvarDados() throws IOException;
    public void recuperarDados() throws IOException;
}
