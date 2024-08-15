package br.ufpb.dcx.davi.agenda;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {

    public static final String ARQUIVO_CONTATO = "contatos.dat";

    public HashMap<String, Contato> recuperarContatos() throws IOException{
        try(ObjectInputStream in = new ObjectInputStream((new FileInputStream(ARQUIVO_CONTATO)))){
            return (HashMap<String, Contato>) in.readObject();
        } catch(ClassNotFoundException e){
            throw new IOException(e);
        }
    }
    public void salvaContatos(Map<String, Contato> contatos) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream((new FileOutputStream(ARQUIVO_CONTATO)))){
            out.writeObject(contatos);
        }
    }
}
