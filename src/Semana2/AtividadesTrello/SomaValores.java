package AtividadesTrello;
import java.util.Scanner;

public class SomaValores {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); //Cria um objeto Scanner para ler entrada usuario

        //Solicita e lê o primeiro número inteiro
        System.out.print("Digite o valor (A): ");
        int A = scanner.nextInt();

        //Solicita e lê o segundo número inteiro
        System.out.print("Digite o valor (B): ");
        int B = scanner.nextInt();

        //Realiza a soma dos dosi numeros
        int soma = A + B;

        //Exibe o resultado
        System.out.println("SOMA = " + soma);

        //Fecha o scanner
        scanner.close();
    }

}
