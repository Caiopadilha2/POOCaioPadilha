package atividade10;

public class main3 {
	class CupomDesconto {

	    private String codigo;
	    private double porcentagem;

	    public CupomDesconto(String codigo, double porcentagem) {
	        this.codigo = codigo;
	        this.porcentagem = porcentagem;
	    }
	    
	    public String getCodigo() {
	        return codigo;
	    }

	    public double getPorcentagem() {
	        return porcentagem;
	    }

	}
}
