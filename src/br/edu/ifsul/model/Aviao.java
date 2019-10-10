package br.edu.ifsul.model;

public class Aviao extends Personagem implements ArmamentoVip {
    private boolean abater;

    public Aviao(){
        super();
    }

    public Aviao(boolean abater) {
        this.abater = abater;
    }

    public Aviao(int pontuacao, boolean abatido) {
        super(pontuacao, abatido);
    }

    public Aviao(int id, int pontuacao, boolean abatido, int size, boolean abater) {
        super(id, pontuacao, abatido, size);
        this.abater = abater;
    }

    @Override
    public void abater(boolean abater) {

    }

    @Override
    public int anexar(int quantidade, String tipo) {
        return 0;
    }
}
