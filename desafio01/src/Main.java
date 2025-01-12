public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.olaMundo();


        Calculadora c = new Calculadora();
        System.out.println(c.dobro(28)+"\n");


        Musica m = new Musica();
        m.titulo = "Time";
        m.artista = "Pink Floyd";
        m.anoLancamento = 1973;
        m.exibirFicha();

        m.avaliarMusica(10);
        m.avaliarMusica(9);
        m.avaliarMusica(9.5);

        double media = m.obtemMedia();
        System.out.println(media+"\n");


        Carro car =  new Carro();
        car.modelo = "Celta";
        car.ano = 2015;
        car.cor = "Preto";

        car.fichaTecnica();
        System.out.println("A idade do carro é de " + car.idadeCarro() + " anos!\n");

        Aluno a = new Aluno();
        a.nome = "Vinicius Brunoni";
        a.idade = 23;
        a.exibeInf();
    }
}
