package Iphone2007;

record Aplicativo(String nome, String versao) {
    void abrir() {
        System.out.println("Abrindo o aplicativo: " + nome);
    }

    void fechar() {
        System.out.println("Fechando o aplicativo: " + nome);
    }
}
