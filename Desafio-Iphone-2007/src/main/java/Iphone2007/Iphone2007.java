package Iphone2007;

class IPhone2007 implements Dispositivo, Telefone, MediaPlayer, Navegador, VideoPlayer {
    private String modelo;
    private String sistemaOperacional;
    private double tamanhoTela;
    private int capacidadeBateria;
    private int armazenamento;
    private boolean temWiFi;
    private boolean temBluetooth;

    public IPhone2007(String modelo, String sistemaOperacional, double tamanhoTela, int capacidadeBateria, int armazenamento, boolean temWiFi, boolean temBluetooth) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
        this.armazenamento = armazenamento;
        this.temWiFi = temWiFi;
        this.temBluetooth = temBluetooth;
    }

    @Override
    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
    }

    @Override
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }


    @Override
    public void reproduzirVideo(String video) {
        System.out.println("Reproduzindo vídeo: " + video);
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " mAh");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("WiFi: " + (temWiFi ? "Sim" : "Não"));
        System.out.println("Bluetooth: " + (temBluetooth ? "Sim" : "Não"));
    }


    @Override
    public void acessarInternet() {
        System.out.println("Acessando a internet...");
    }
}
