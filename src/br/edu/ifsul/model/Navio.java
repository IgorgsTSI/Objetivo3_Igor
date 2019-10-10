package br.edu.ifsul.model;

import java.util.List;

public class Navio extends Personagem implements ArmamentoVip {
    private boolean abater;


    public Navio(){ super(); }

    public Navio(boolean abater) {
        this.abater = abater;
    }

    public Navio(int pontuacao, boolean abatido) {
        super(pontuacao, abatido);
    }

    public Navio(int id, int pontuacao, boolean abatido, int size, boolean abater) {
        super(id, pontuacao, abatido, size);
        this.abater = abater;
    }

    @Override
    public int anexar(int quantidade, String tipo) {
        return 0;
    }


    @Override
    public void abater(boolean abater) {

    }
}
