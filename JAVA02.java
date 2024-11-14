import java.util.Scanner;

public class JAVA02 {
    public static void main(String[] args) {
      
       /* 
       Faça um programa que peça ao usuário para digitar 
        3 valores inteiros e imprima a soma deles
       */ 

       Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
            int num1 = teclado.nextInt();

       System.out.print("Digite outro número inteiro: ");
            int num2 = teclado.nextInt();

       System.out.print("Digite outro número inteiro: ");
            int num3 = teclado.nextInt();

    int soma = num1 + num2 + num3;
    System.out.println("A soma dos três números é: " + soma); 

        teclado.close();

    }
}
