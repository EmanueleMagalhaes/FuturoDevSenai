package treino;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção de 1 a 4: ");
        int valor = entrada.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Produto sem lactose");
                break;
            case 2:
                System.out.println("Produto sem glúten");
                break;
            case 3:
                System.out.println("Produto sem farinha");
                break;
            case 4:
                System.out.println("Produto vencido");
                break;
            default:
                System.out.println("Opção inválida");
        }


    }


}
