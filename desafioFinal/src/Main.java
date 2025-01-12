public class Main {
    public static void main(String[] args) {

        Podcast podcast = new Podcast();
        podcast.setTitulo("PodBrunoni");
        podcast.setDuracao(130);
        podcast.setHost("Vinicius Brunoni");
        podcast.setDescricao("Primeiro episodio...");

        podcast.curtir();
        podcast.curtir();
        podcast.curtir();
        System.out.println("O número de curtidas desse podcast é de " + podcast.getCurtidas());

        podcast.reproduzir();
        podcast.reproduzir();
        podcast.reproduzir();
        podcast.reproduzir();
        podcast.reproduzir();
        podcast.reproduzir();
        System.out.println("O número de reproduções desse podcast é de " + podcast.getTotalReproducoes());

        Musica musica = new Musica();
        musica.setTitulo("Time");
        musica.setArtista("Pink Floyd");
        musica.setGenero("Rock");

        for (int i = 0; i < 2350; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            musica.curtir();
        }

        System.out.println("A música " + musica.getTitulo() + " foi reproduzida " + musica.getTotalReproducoes() + " vezes!!!");
        System.out.println("A música " + musica.getTitulo() + " foi curtida " + musica.getCurtidas() + " vezes!!!");

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);










    }
}
