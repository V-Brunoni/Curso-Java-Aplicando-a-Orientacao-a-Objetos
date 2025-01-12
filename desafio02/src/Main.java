public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(12345);
        conta.setSaldo(5000);
        conta.titular = "Vinicius";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(15000);
        System.out.println("Novo Saldo: " + conta.getSaldo() + "\n");

        idadePessoa ip = new idadePessoa();
        ip.setNome("Vinicius");
        ip.setIdade(23);
        System.out.println(ip.getNome() + " tem " + ip.getIdade() + " anos.");
        ip.verificarIdade();

        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setPreco(500);
        System.out.println("\nO valor do produto com desconto é de R$"+produto.aplicarDesconto(50));
    }
}
