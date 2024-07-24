public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    public static void main(String[] args) {
        Iphone Iphone = new Iphone();

        // Testando ReprodutorMusical
        Iphone.tocar();
        Iphone.pausar();
        Iphone.selecionarMusica("Minha Música Favorita");

        // Testando AparelhoTelefonico
        Iphone.ligar("123456789");
        Iphone.atender();
        Iphone.iniciarCorreioVoz();

        // Testando NavegadorNaInternet
        Iphone.exibirPagina("http://www.exemplo.com");
        Iphone.adicionarNovaAba();
        Iphone.atualizarPagina();
    }

    // Implementação dos métodos do ReprodutorMusical
    public void tocar() {
        System.out.println("Reproduzindo música");
    }
    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos do AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    // Implementação dos métodos do NavegadorNaInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}