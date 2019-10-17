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

    public Tanque(int id, int pontuacao, boolean abatido, boolean abater, int quantidade) {
        super(id, pontuacao, abatido);
        this.abater = abater;
        this.quantidade = quantidade;
    }
    @Override
    public List<Personagem> gerar(int quantidade, int size) {
        List<Personagem> personagens = new ArrayList<>();

        int acum = size;
            for (int i = 0; i < quantidade ; i++) {
                Tanque tanque1 = new Tanque(size+1+i,100,false, false, 1);
                personagens.add(tanque1);
            }

            return personagens;


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
