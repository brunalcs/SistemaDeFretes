package SistemaDeCalculo;

public abstract class Entregador {
	String nome;
	
	public Entregador(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
        return nome;
    }
	
}
