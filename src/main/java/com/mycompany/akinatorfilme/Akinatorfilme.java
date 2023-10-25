package com.mycompany.akinatorfilme;

import javax.swing.JOptionPane;

public class Akinatorfilme {
    public static void main(String[] args) {
        // Variáveis
        String real, assombracao, ficcao, escolha;

        // Entrada
        JOptionPane.showMessageDialog(null, "Bem-vindo ao AKINATOR de Filmes!");
        JOptionPane.showMessageDialog(null, "Vamos ajudá-lo a escolher um filme para assistir");

        // Perguntas
        real = Pergunta.fazerPergunta("Os atores do filme são humanos? (S/N)");
        assombracao = Pergunta.fazerPergunta("Tem assombração? (S/N)");
        ficcao = Pergunta.fazerPergunta("É uma ficção? (S/N)");

        // Escolher Filme
        escolha = Filme.escolherFilme(real, assombracao, ficcao);
        JOptionPane.showMessageDialog(null, "Recomendação de filme: " + escolha);
    }
}
