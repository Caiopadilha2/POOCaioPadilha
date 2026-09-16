import java.util.Scanner;

class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class validaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException(
                    "Erro: a idade deve estar entre 0 e 150 anos."
                );
            }
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}