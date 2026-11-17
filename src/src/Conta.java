public class Conta {

    private String numero;
    private String titular;
    private double saldo;

    Conta(String numero, String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    void depositar(double valor){
        if (valor > 0){
            saldo = saldo + valor;
        } else{
            System.out.println("Depósito inválido");
        }
    }

    boolean sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor de Saque Inválido");
            return false;
        }
        if (valor > saldo){
            System.out.println("Saldo Insuficiente");
            return false;
        }
        saldo = saldo - valor;
            return true;
    }

    void exibirExtrato(){
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}
