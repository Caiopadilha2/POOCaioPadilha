import java.util.InputMismatchException;
import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");

        } finally {
            System.out.println("Fim da operação");
        }

        scanner.close();
    }
}
