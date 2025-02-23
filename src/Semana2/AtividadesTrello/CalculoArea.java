package AtividadesTrello;
import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor do raio
        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        // Definindo o valor de π
        final double PI = 3.14159;

        // Calculando a área da circunferência
        double area = PI * Math.pow(raio, 2);

        // Imprimindo o resultado formatado
        System.out.printf("A = %.1f%n", area);

        scanner.close();
    }
}

