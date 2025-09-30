package SistemaDeCalculo;

public class main {
	public static void main(String[] args) {
		ServicoDeEntrega servico = new ServicoDeEntrega();
		
		Carro carro = new Carro("AOP-4567", 2019);
		Funcionario funcionario = new Funcionario("Gabriel");
		
		servico.adicionarItem(funcionario);
		servico.adicionarItem(carro);
		
		System.out.println("\n=== Primeira Entrega ===");
		servico.exibirDetalhes(10);
		
		double total1 = servico.calcularCustoTotal(10);
		System.out.println("Custo total da primeira entrega: R$ " + total1);
		
		servico.limpar();
		
		Motocicleta motocicleta = new Motocicleta("RTY-7832", 2024);
		Autonomo autonomo = new Autonomo("Bruna");
		
		servico.adicionarItem(autonomo);
		servico.adicionarItem(motocicleta);
		
		System.out.println("\n=== Segunda Entrega ===");
		servico.exibirDetalhes(25);
		
		double total2 = servico.calcularCustoTotal(25);
		System.out.println("Custo total da segunda entrega: R$ " + total2);
		
		
	}
}
