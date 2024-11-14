import java.util.Scanner;

public class JAVA03 {
    public static void main(String[] args) {

        /*
         * Faça um programa que peça ao usuário para digitar
         * um número real e imprima o quadrado dele
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número real: ");
        double num = scanner.nextDouble();

        double quadrado = num * num;

        System.out.println("O número digitado foi: " + num);
        System.out.println(num + " elevado ao quadrado é: " + quadrado);

        scanner.close();

    }
}
