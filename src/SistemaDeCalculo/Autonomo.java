package SistemaDeCalculo;

public class Autonomo extends Entregador implements Fretavel {
	
	public Autonomo(String nome) {
		super(nome);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm*0.95;
	}
	
	@Override
	public String toString() {
	    return "Autonomo: " + getNome();
	}

}
