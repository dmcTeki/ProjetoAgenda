package br.ufpb.dcx.davi.agenda;

public class ContatoInexistenteException extends Exception{
    ContatoInexistenteException(String msg){
        super(msg);
    }
    public ContatoInexistenteException(){
        super("Contato inexistente.");
    }
}
