import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("=== SISTEMA BANCÁRIO ===");
        System.out.print("Digite o seu nome para iniciar: ");
        String nome = usuario.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nOlá, " + conta.getTitular() + " | Saldo atual: R$ " + String.format("%.2f", conta.getSaldo()));
            System.out.println("1. Sacar");
            System.out.println("2. Guardar");
            System.out.println("3. Ver Extrato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = usuario.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("\nQual valor você deseja sacar: R$ ");
                        double valorSacar = Double.parseDouble(usuario.nextLine());

                        if (valorSacar <= 0) {
                            System.out.println("Erro: O valor do saque deve ser maior que zero.");
                        } else if (!conta.sacar(valorSacar)) {
                            System.out.println("Erro: Saldo insuficiente para realizar esta operação.");
                        } else {
                            System.out.printf("Sucesso! R$ %.2f sacados.\n", valorSacar);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida. Digite apenas números.");
                    }
                    break;

                case "2":
                    try {
                        System.out.print("\nQual valor você deseja guardar: R$ ");
                        double valorGuardar = Double.parseDouble(usuario.nextLine());

                        if (valorGuardar <= 0) {
                            System.out.println("Erro: O valor depositado deve ser maior que zero.");
                        } else if (conta.getSaldo() + valorGuardar > 999999.99) {
                            System.out.println("Erro: O saldo não pode ultrapassar o limite de R$ 999.999,99.");
                        } else {
                            conta.depositar(valorGuardar);
                            System.out.printf("Sucesso! R$ %.2f guardados.\n", valorGuardar);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida. Digite apenas números.");
                    }
                    break;

                case "3":
                    conta.exibirExtrato();
                    break;

                case "4":
                    System.out.println("\nSistema encerrado. Obrigado por utilizar nossos serviços!");
                    continuar = false;
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        }
        usuario.close();
    }
}
