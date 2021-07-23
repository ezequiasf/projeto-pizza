import classes.CarrinhoDeCompra;
import classes.Pizza;

public class Principal {

    public static void main(String[] args) {
        Pizza p1 = new Pizza ();
        Pizza p2 = new Pizza ();
        Pizza p3 = new Pizza ();

        //Deve retornar 20.00
        p1.addIngrediente("queijo",1).addIngrediente("tomate",1).addIngrediente("cebola",2);

        //Deve retornar 15.00
        p2.addIngrediente("queijo",1).addIngrediente("calabresa",1);

        //Deve retornar 23.00
        p3.addIngrediente("queijo",3).addIngrediente("mozzarela",3)
        .addIngrediente("parmesão",3);

        //58.00
        CarrinhoDeCompra c1 = new CarrinhoDeCompra(p1,p2,p3);
        System.out.println("O valor total é: "+c1.valorTotal());

        //Deve lançar uma exception
        Pizza p4 = new Pizza ();
        c1.addPizza(p4);
        c1.valorTotal();
    }
}
