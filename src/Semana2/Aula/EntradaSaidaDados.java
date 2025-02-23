package Aula;

import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("CADASTRO DE USUÁRIO\nNome Completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.print("Idade: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Endereço: ");
        String endereco = scan.nextLine();

        System.out.println("RELATÓRIO DO USUÁRIO");
        System.out.printf("nomeCompleto: %s\nIdade: %d\nEndereço: %", nomeCompleto,age,endereco);

// %i %d -> Inteiros
// %s -> String
//%f -> Decimais
// %c -> Caractere Único


    }
}
