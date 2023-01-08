package src;

public class Main {

    public static void main(String[] args) {
        Cliente chegado = new Cliente();
        chegado.setNome("Chegado");

        Conta cc = new ContaCorrente(chegado);
        Conta poupanca = new ContaPoupanca(chegado);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
