package cursoJavaScreenmatchModelos;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int epTemporadas;
    private int minutosEpisodio;

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    public int getEpTemporadas() {
        return epTemporadas;
    }

    public void setEpTemporadas(int epTemporadas) {
        this.epTemporadas = epTemporadas;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override  // possibilita a sobrescrita de um método
    public int getDuracaoMinutos() {
        return temporadas * epTemporadas * minutosEpisodio;
    }
}
