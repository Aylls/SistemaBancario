public class Main {
    public static void main(String[] args){

        Conta c = new Conta("0001", "Brenda");
        c.depositar(500);
        c.sacar(200);
        c.sacar(1000);
        c.depositar(-50);
        c.exibirExtrato();

    }
}
