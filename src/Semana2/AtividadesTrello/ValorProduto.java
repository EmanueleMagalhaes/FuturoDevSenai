package AtividadesTrello;

import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] ages) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("RETORNA O PRODUTO DE DOIS NÚMEROS INTEIROS"); // IMPRIME UM TEXTO

        //Solicitar o primeiro valor
        System.out.println("Digite o primeiro número");
        int valor1 = scanner.nextInt();

        //Solicitar o segundo valor
        System.out.println("Digite o segundo número");
        int valor2 = scanner.nextInt();

        //calculo da multiplicação
        int resultado = valor1 * valor2;

        // exibir o resultado
        System.out.println("PRODUTO = " + resultado);

        scanner.close();


    }
}
