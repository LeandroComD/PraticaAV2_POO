package br.com.questao01;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String dataCriacao;
        String nomeUsuario;
        String dataNascimento;
        String senha;

        nomeUsuario = JOptionPane.showInputDialog(null,"Informe o nome: ");
        dataNascimento = JOptionPane.showInputDialog(null,"Informe a data de nascimento: ");
        senha = JOptionPane.showInputDialog(null,"Informe a senha de acesso: ");
        dataCriacao = JOptionPane.showInputDialog(null,"Informe a data de criacao: ");
        RedeSocial social = new RedeSocial(dataCriacao,nomeUsuario, dataNascimento, senha);

        social.imprimePublicacoes();


    }
}
