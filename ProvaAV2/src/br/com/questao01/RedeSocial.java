package br.com.questao01;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = publicacoes;
    }


    public void inserePublicacao(Publicacao publi){
        publicacoes.add(publi);
    }

    public void imprimePublicacoes(){

       Publicacao.getContadorPublicacao();

    }

}
