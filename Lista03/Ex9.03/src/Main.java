import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

                boolean jogarNovamente = true;

                while (jogarNovamente) {
                    System.out.println("Jogo da Tabuada");

                    boolean jogadorPerdeu = false;

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            int resultadoEsperado = i * j;

                            System.out.print(i + " x " + j + " = ");
                            int respostaUsuario = in.nextInt();

                            if (respostaUsuario != resultadoEsperado) {
                                System.out.println("Você perdeu!");
                                jogadorPerdeu = true;
                                break;
                            }
                        }

                        if (jogadorPerdeu) {
                            break;
                        }
                    }

                    if (!jogadorPerdeu) {
                        System.out.println("Parabéns! Você completou toda a tabuada!");
                    }

                    System.out.print("Jogar novamente? (S/N): ");
                    String resposta = in.next().toUpperCase();

                    if (!resposta.equals("S")) {
                        jogarNovamente = false;
                    }
                }

                System.out.println("Obrigado por jogar!");
            }
        }