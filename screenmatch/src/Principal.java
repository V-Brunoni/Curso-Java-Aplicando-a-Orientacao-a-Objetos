import cursoJavaScreenmatchCalculo.CalculadoraDeTempo;
import cursoJavaScreenmatchCalculo.FiltroRecomendacao;
import cursoJavaScreenmatchModelos.Episodio;
import cursoJavaScreenmatchModelos.Filme;
import cursoJavaScreenmatchModelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("A média das avaliações do filme é %.2f", meuFilme.pegaMedia());
        System.out.println("\n");

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Rick And Morty");
        minhaSerie.setAnoLancamento(2013);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpTemporadas(12);
        minhaSerie.setMinutosEpisodio(25);
        System.out.println("Duração total da série: " + minhaSerie.getDuracaoMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(98);
        filtro.filtra(episodio);







    }
}
