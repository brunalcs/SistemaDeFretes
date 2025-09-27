package SistemaDeCalculo;

public class Autonomo extends Entregador implements Fretavel {
	
	public Autonomo(String nome) {
		super(nome);
	}
	
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm*0.95;
	}
}
