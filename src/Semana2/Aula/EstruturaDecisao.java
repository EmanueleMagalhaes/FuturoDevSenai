package Aula;
import java.util.Scanner; // importar o scanner

public class EstruturaDecisao {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        System.out.print("CADASTRO DE USUÁRIO\nNome Completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.print("Idade: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Endereço: ");
        String endereco = scan.nextLine();

        System.out.println("RELATÓRIO DO USUÁRIO");
        System.out.println("nomeCompleto: %s\n");

    }
}
