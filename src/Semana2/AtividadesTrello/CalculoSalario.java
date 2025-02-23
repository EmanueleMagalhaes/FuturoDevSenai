package AtividadesTrello;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] ages) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULO DO SALÁRIO");

        // LE O NOME DO FUNCIONARIO
        System.out.println("Nome do Funcionário: ");
        String funcionario = scanner.nextLine();

        // LE O NUMERO DE HORAS
        System.out.println("Digite o número de horas trabalhada: ");
        int Nhoras = scanner.nextInt();

        // LE O VALOR DA HORA RECEBIDA
        System.out.println("Digite o valor da hora recebida: ");
        double Vhora = scanner.nextDouble();

        // CALCULO DO VALOR DO SALARIO
        double TotalSalario = Nhoras * Vhora;

        // EXIBIR O VALOR DO SALARIO A RECEBER
        System.out.printf("O funcionário (a) %s trabalhou %d horas, e portanto possui R$ %.2f a receber.%n", funcionario, Nhoras, TotalSalario);

        scanner.close();
    }
}
