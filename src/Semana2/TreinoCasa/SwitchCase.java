package treino;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 3: ");
        int valor = entrada.nextInt();

        switch (valor) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            default:
                System.out.println("Número fora do intervalo");
        }

    }


}
