package atividade10;

interface Rastreavel {
    String getRastreio();
}

class PacoteCorreios implements Rastreavel {
    public String getRastreio() {
        return "Pacote correios.";
    }

}

class CargaTransportadora implements Rastreavel {

    public String getRastreio() {
        return "Carga da transportadora.";
    }
}

class EntregaExpressa implements Rastreavel {

    public String getRastreio() {
        return "Entrega expressa.";
    }

}

class CentralRastreamento {
    public static void inspecionarItem(Object item) {
        if (item instanceof Rastreavel) {
            Rastreavel rastreavel = (Rastreavel) item;
            System.out.println(rastreavel.getRastreio());
        } else {
            System.out.println("O item não é passível de rastreamento.");
        }
    }
}
