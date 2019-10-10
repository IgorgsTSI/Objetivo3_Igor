package br.edu.ifsul.model;

import java.util.ArrayList;
import java.util.List;

public class Tanque extends Personagem{
    private boolean abater;
    private int quantidade;

    public Tanque(){
        super();
    }

    public Tanque(int pontuacao, boolean abatido) {
        super(pontuacao, abatido);
    }

    public Tanque(boolean abater, int quantidade) {
        this.abater = abater;
        this.quantidade = quantidade;
    }

    public Tanque(int id, int pontuacao, boolean abatido, int size, boolean abater, int quantidade) {
        super(id, pontuacao, abatido, size);
        this.abater = abater;
        this.quantidade = quantidade;
    }



    @Override
    public void abater(boolean abater) {
        this.abater = abater;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "abater=" + abater +
                ", quantidade=" + quantidade +
                ", id=" + id +
                ", pontuacao=" + pontuacao +
                ", abatido=" + abatido +
                '}';
    }
}
