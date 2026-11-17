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
}
