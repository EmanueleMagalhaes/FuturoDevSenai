package Aula;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); // Formato para 2 casas decimais

        System.out.print("CALCULADO DE BONUS SALARIAL\n");

        System.out.print("Insira o valor do Salário: ");
        double salario = scan.nextDouble();

        System.out.print("Insira tempo de serviço em anos");
        int tempo = scan.nextInt();

        double bonus;
        if (tempo>=5){
            bonus = salario * 0.10;
        }else {
            bonus = salario * 0.05;
        }

        double novoSalario = salario + bonus;

        // Exibe os resultados formatados
        System.out.println("\nSalário original: R$" + df.format(salario));
        System.out.println("Bônus calculado: R$" + df.format(bonus));
        System.out.println("Novo salário após o bônus: R$" + df.format(novoSalario));

        scan.close();
    }
}