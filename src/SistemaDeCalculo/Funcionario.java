package SistemaDeCalculo;

public class Funcionario extends Entregador implements Fretavel {
	public Funcionario(String nome) {
		super(nome);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return 5.0; //custo fixo
	}
	
	@Override
	public String toString() {
	    return "Funcionario: " + getNome();
	}

}
