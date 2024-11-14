import java.util.Scanner;

public class JAVA01 {
    public static void main(String[] args) {
        // Faça um programa que leia um número inteiro e o imprima

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = teclado.nextInt();
        System.out.println("O número digitado foi: " + num1);

       teclado.close();
    }
}
