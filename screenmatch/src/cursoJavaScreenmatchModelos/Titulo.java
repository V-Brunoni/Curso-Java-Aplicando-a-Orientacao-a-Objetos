package cursoJavaScreenmatchModelos;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Titulo: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
    }


    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
