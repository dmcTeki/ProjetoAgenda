package br.ufpb.dcx.davi.agenda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaAgenda {
    private Map<String, Contato> contatos;
    public SistemaAgenda(Map<String, Contato> contatos) {
        this.contatos = new HashMap<>();
    }

    public boolean CadastraContato(String nome, int dia, int mes) {
        if (!contatos.containsKey(nome)) {
            Contato c = new Contato(nome, dia, mes);
            contatos.put(nome, c);
            return true;
        }
         return false;
    }

    public Collection<Contato> pesquisaAniversariantes(int dia, int mes){
        Collection<Contato> aniversariantes = new ArrayList<>();
        for(Contato c: contatos.values()){
            if(c.getDiaAniversario() == dia && c.getMesAniversario() == mes){
                aniversariantes.add(c);
            }
        } return aniversariantes;
    }
    public boolean removeContato(String nome){
        for(Contato c: contatos.values()){
            if(c.getNome().equals(nome)){
                contatos.remove(nome, c);
                return true;
            }
        } return false;
    }
}
