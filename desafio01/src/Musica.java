public class Musica {


    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;


    void exibirFicha(){
        System.out.println("Titulo da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double obtemMedia(){
        return avaliacao / numAvaliacoes;
    }
}
