import java.util.ArrayList;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private ArrayList<String> extrato;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.extrato.add(String.format("Saque: -R$ %.2f", valor));
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0 && (this.saldo + valor <= 999999.99)) {
            this.saldo += valor;
            this.extrato.add(String.format("Depósito: +R$ %.2f", valor));
            return true;
        }
        return false;
    }

    public void exibirExtrato() {
        System.out.println("\n=== EXTRATO BANCÁRIO ===");
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma movimentação realizada.");
        } else {
            for (String transacao : extrato) {
                System.out.println(transacao);
            }
        }
        System.out.printf("Saldo Atual: R$ %.2f\n", this.saldo);
        System.out.println("========================");
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
