import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String tipoConta;
        double saldo;
        int opcao = 0;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite o tipo da sua conta: ");
        tipoConta = scanner.nextLine();
        System.out.println("Digite seu saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("\n################## Bem Vindo ao Banco do Artureba ####################");
        System.out.println("Dados do Cliente:");
        System.out.println("\nNome:             " + nome);
        System.out.println("Tipo conta:       "+ tipoConta);
        System.out.println("Saldo inicial:    R$"+ saldo);
        System.out.println("######################################################################");

        String menu = """
                \n# Operações disponiveis:
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                -1 - Sair
                \nDigite a opção que deseja:
                """;

        while (opcao != -1) {
            System.out.print(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nO seu saldo atual é R$ " + saldo);
                    break;
                case 2:
                    double receberValor;
                    System.out.println("\nInforme o valor a receber: ");
                    receberValor = scanner.nextDouble();
                    saldo = saldo + receberValor;
                    System.out.println("\nSeu saldo atualizado é de R$ " + saldo);
                    break;
                case 3:
                    double transferirValor;
                    System.out.println("\nInforme o valor que deseja transferir: ");
                    transferirValor = scanner.nextDouble();
                    if (transferirValor > saldo) {
                        System.out.println("\nNão há saldo suficiente para fazer essa transferência!");
                    } else {
                        saldo = saldo - transferirValor;
                        System.out.println("\nSeu saldo atualizado é de R$ " + saldo);
                    }
                    break;
                case -1:
                    System.out.println("Obrigado por utilizar nosso Banco!");
                    break;
                default:
                    System.out.println("\n!!! Opção inválida! !!!");
                    break;
            }
        }
    }
}