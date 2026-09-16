public class ConversorNumero {

    public static int converterParaInteiro(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }

    public static void main(String[] args) {

        String texto = "123";

        try {
            int numero = converterParaInteiro(texto);
            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: a string não contém um número válido.");
        }
    }
}