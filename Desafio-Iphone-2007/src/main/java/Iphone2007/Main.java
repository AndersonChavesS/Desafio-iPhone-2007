package Iphone2007;

class Main {
    public static void main(String[] args) {
        IPhone2007 iphone = new IPhone2007("iPhone 2007", "iOS 1.0", 3.5, 1400, 16, true, true);
        iphone.ligar();
        iphone.fazerChamada("+55 11 99999-8888");
        iphone.enviarSMS("+55 11 99999-8888", "Olá!");
        iphone.reproduzirMusica("Billie Jean - Michael Jackson");
        iphone.acessarInternet();
        iphone.reproduzirVideo("Apresentação do iPhone 2007");
        iphone.mostrarInformacoes();
        iphone.desligar();
    }
}
