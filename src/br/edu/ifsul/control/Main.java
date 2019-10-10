package br.edu.ifsul.control;

import br.edu.ifsul.model.Aviao;
import br.edu.ifsul.model.Navio;
import br.edu.ifsul.model.Personagem;
import br.edu.ifsul.model.Tanque;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Tanque tanque1 = new Tanque(10, false);
        Tanque tanque2 = new Tanque(10, false);
        Tanque tanque3 = new Tanque(10, false);

        Navio navio1 = new Navio(100, false);
        Navio navio2 = new Navio(100, false);
        Navio navio3 = new Navio(100, false);

        Aviao aviao1 = new Aviao(50, false);
        Aviao aviao2 = new Aviao(50, false);
        Aviao aviao3 = new Aviao(50, false);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(tanque1);
        personagens.add(tanque2);
        personagens.add(tanque3);
        personagens.add(navio1);
        personagens.add(navio2);
        personagens.add(navio3);
        personagens.add(aviao1);
        personagens.add(aviao2);
        personagens.add(aviao3);
        System.out.println(personagens);
    }

}
