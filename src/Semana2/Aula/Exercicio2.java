package Aula;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] ages) {
        Scanner scan = new Scanner(System.in);

        System.out.println("CLASSIFICAÇÃO POR IDADE\n Digite a idade: ");
        int idade = scan.nextInt();

        if (idade <= 12 && idade>=0) {
            System.out.println("CRIANÇA");
        }else if (idade >=13 && idade <= 19) {
            System.out.println("ADOLESCENTE");
        }else if (idade >=20){
            System.out.println("ADULTO");
        }else{
            System.out.println("IDADE INVALIDA");
        }
    }
}
