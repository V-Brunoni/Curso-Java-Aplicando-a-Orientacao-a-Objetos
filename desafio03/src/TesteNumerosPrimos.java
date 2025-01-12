public class TesteNumerosPrimos {
    public static void main(String[] args) {

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O proximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);






    }
}
