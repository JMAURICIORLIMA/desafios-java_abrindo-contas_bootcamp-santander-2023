package resolucao02.dominio;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: " + this.taxaJuros + "%");
    }
}
