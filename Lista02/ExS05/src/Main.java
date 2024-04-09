import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.print("Digite o valor em reais: ");
        Scanner in = new Scanner(System.in);
        double valorInserido = in.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Café Preto - R$2.50");
        System.out.println("2. Café com Leite - R$3.00");
        System.out.println("3. Cappuccino - R$3.50");
        System.out.print("Escolha a opção desejada (1, 2 ou 3): ");

        int escolha = in.nextInt();
        double preco = 0;
        String bebida = "";

        switch (escolha) {
            case 1:
                preco = 2.50;
                bebida = "Café Preto";
                break;
            case 2:
                preco = 3.00;
                bebida = "Café com Leite";
                break;
            case 3:
                preco = 3.50;
                bebida = "Cappuccino";
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        if (valorInserido < preco) {
            System.out.println("Valor inserido insuficiente para comprar " + bebida);
        } else {
            double troco = valorInserido - preco;
            System.out.println("Bebida selecionada: " + bebida);
            System.out.println("Troco: R$" + troco);
        }
    }
}