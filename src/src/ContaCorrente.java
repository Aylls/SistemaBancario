public class ContaCorrente extends Conta {
    private double limite;

    ContaCorrente(String numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    boolean sacar(double valor) {
        if (valor <= 0){
            System.out.println("Valor de Saque Inválido");
            return false;
        }
        if (valor > saldo + limite){
            System.out.println("Saldo e Limite Insuficientes");
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

}
