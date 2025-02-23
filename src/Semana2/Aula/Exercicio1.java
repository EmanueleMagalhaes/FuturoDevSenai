package Aula;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] ages) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número PAR ou ÍMPAR?\n Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número Par");
        }else{
            System.out.println("Número Impar");
        }
    }
}
