public class Main {
    public static void main(String[] args){

        Conta c = new Conta("0001", "Brenda");
        Conta c2 = new Conta("0002", "Guilherme");

        c.depositar(500);
        c.sacar(200);
        c.sacar(1000);
        c.depositar(-50);
        c.exibirExtrato();

        c2.depositar(100);
        System.out.println(c2.sacar(550));
        System.out.println(c2.sacar(100));
        c2.exibirExtrato();
    }
}
