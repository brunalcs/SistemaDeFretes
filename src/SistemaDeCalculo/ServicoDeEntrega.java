package SistemaDeCalculo;
import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
	private List<Fretavel> itensEntrega; 

    public ServicoDeEntrega() {
        this.itensEntrega = new ArrayList<>();
    }

    public void adicionarItem(Fretavel item) {
        itensEntrega.add(item);
    }

   
    public double calcularCustoTotal(double distanciaEmKm) {
        double total = 0.0;
        for (Fretavel item : itensEntrega) {
            total += item.calcularCustoFrete(distanciaEmKm);
        }
        return total;
    }
    
    public void limpar() {
    	itensEntrega.clear();
    }
    
    //para controle dos dados
    public void exibirDetalhes(double distanciaEmKm) {
        System.out.println("Itens da entrega:");
        for (Fretavel item : itensEntrega) {
            System.out.println(" - " + item.toString() + 
                               " | Custo: R$ " + item.calcularCustoFrete(distanciaEmKm));
        }
        
    }

}
