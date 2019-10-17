package br.edu.ifsul.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    protected int id;
    protected int pontuacao;
    protected boolean abatido;
    private int quantidade;

    public Personagem(){

    }

    public Personagem(int id, int pontuacao, boolean abatido) {
        this.id = id;
        this.pontuacao = pontuacao;
        this.abatido = abatido;
    }

    public Personagem(int pontuacao, boolean abatido){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isAbatido() {
        return abatido;
    }

    public void setAbatido(boolean abatido) {
        this.abatido = abatido;
    }

    public List<Personagem> gerar(int quantidade, int size){
        List<Personagem> personagens = new ArrayList<>();
        int acum = size;
        for (int i = 0; i < quantidade ; i++) {
            personagens.add();
        }

            return personagens;
    }

    public abstract void abater(boolean abater);


}
