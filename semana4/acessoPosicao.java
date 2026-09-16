import java.util.InputMismatchException;
import java.util.Scanner;

public class acessoPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cidades = {
            "Niteroí",
            "Maricá",
            "Rio Bonito",
            "São Gonçalo",
            "Búzios"
        };

        try {
            System.out.print("Digite um número de 0 a 4: ");
            int indice = scanner.nextInt();

            System.out.println("Cidade escolhida: " + cidades[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inexistente! Digite um número de 0 a 4.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");
        }

        scanner.close();
    }
}