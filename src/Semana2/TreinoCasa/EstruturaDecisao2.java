package treino;
import java.util.Scanner; // importar o scanner

public class EstruturaDecisao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //criando o objeto scanner

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else  if (idade >= 18 && idade <= 70) {
            System.out.println("Obrigatorio Votar");
        } else {
            System.out.println("Pode votar");
        }
    }

}
