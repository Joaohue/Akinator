package com.mycompany.akinatorfilme;

public class Filme {
    public static String escolherFilme(String real, String assombracao, String ficcao) {
        if (real.equalsIgnoreCase("S") && assombracao.equalsIgnoreCase("S")) {
            return "Você pode assistir ao filme 'Invocação do Mal'.";
        } else if (real.equalsIgnoreCase("S") && assombracao.equalsIgnoreCase("N")) {
            return "Que tal assistir ao filme 'Titanic'?";
        } else if (real.equalsIgnoreCase("N") && ficcao.equalsIgnoreCase("S")) {
            return "O filme 'Galinho Chicken Little' pode ser uma boa escolha.";
        } else if (real.equalsIgnoreCase("N") && ficcao.equalsIgnoreCase("N")) {
            return "O filme 'Alvin e os Esquilos' pode ser uma boa escolha.";
        } else {
            return "Não encontramos um filme correspondente às suas preferências.";
        }
    }
}
