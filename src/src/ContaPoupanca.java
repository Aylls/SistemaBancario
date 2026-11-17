public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    ContaPoupanca(String numero, String titular, double taxaRendimento){
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    void aplicarRendimento(double taxaRendimento){
    }
}
