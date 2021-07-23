package classes;

import java.util.Arrays;
import java.util.List;

public class CarrinhoDeCompra {

    private final List<Pizza> pizzas;

    public CarrinhoDeCompra (Pizza... pizzas)
    {
        for (Pizza unidade:pizzas){
            validacaoPizza(unidade);
        }
        this.pizzas = Arrays.asList(pizzas);
    }

    public CarrinhoDeCompra addPizza (Pizza pizza)
    {
        validacaoPizza(pizza);
        pizzas.add(pizza);
        return this;
    }

    private void validacaoPizza (Pizza pizza)
    {
        if(pizza.getIngredientes().size()==0){
            throw new IllegalArgumentException("Pizza precisa ter ao menos um ingrediente!");
        }
    }

    public double valorTotal ()
    {
        return pizzas.stream().map(Pizza::getPreco).reduce(0.0,(num1,num2)->num1+num2);
    }
}
