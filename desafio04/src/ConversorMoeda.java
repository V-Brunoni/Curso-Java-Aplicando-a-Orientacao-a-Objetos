public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valor) {
        double cotacao = 6.11;
        double valorReal = valor * cotacao;
        System.out.println("O valor em reais é de R$" + valorReal);
    }
}
