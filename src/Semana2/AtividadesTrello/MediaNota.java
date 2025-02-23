package AtividadesTrello;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] ages) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULO DE MÉDIA");

        //LER O PRIMEIRO VALOR
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        // LER VALOR SEGUNDO VALOR
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // CALCULO DA MEDIA
        double media = (nota1 + nota2) / 2;

        // EXIBIR A O RESULTADO DA MEDIA
        System.out.printf("MEDIA = %.2f%n",  media);

        scanner.close();



    }
}
