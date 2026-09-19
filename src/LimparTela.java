package com.br.studyingclass.studyingrecord.bankaccount;

public class LimparTela {

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Comando para limpar o console no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para limpar o console no Linux e macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Caso ocorra algum erro, apenas pula linhas como alternativa
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

}
