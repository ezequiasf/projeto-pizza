package classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Pizza {

    private final HashMap<String, Integer> ingredientes;

    public Pizza() {
        ingredientes = new HashMap<>();
    }

    public Pizza addIngrediente(String ingrediente, int qtd) {
        ingredientes.put(ingrediente, qtd);
        return this;
    }

    public Set<String> getIngredientes ()
    {
        return ingredientes.keySet();
    }

    public double getPreco() {
        Collection<Integer> numIngredientes = ingredientes.values();
        int total = numIngredientes.stream().reduce(0, Integer::sum);
        if (total <= 2) {
            return 15.00;
        }else if (total<=5){
            return 20.00;
        }
        return 23.00;
    }
}
