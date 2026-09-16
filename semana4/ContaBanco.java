class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Erro: saldo insuficiente para realizar o saque."
            );
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }
}

public class ContaBanco {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1000.00);

        try {
            conta.sacar(300.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

//        try {
//            conta.sacar(800.00);
//        } catch (SaldoInsuficienteException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
