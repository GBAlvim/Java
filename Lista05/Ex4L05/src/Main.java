/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        if (palindromo(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static boolean palindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}*/


//RECURSIVIDADE
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        if (palindromo(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static boolean palindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return palindromoRecursivo(str, 0, str.length() - 1);
    }

    private static boolean palindromoRecursivo(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindromoRecursivo(str, start + 1, end - 1);
    }
}
