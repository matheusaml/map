public class Cliente {
	public static void main(String[] args) {
		Pizzaria pizzaria = new Pizzaria(
	            new NYPizzaBuilder());
	 
	    pizzaria.construirPizza();
	    PizzaProduto pizza = pizzaria.getPizza();
	    System.out.println("Pizza: Queijo " + pizza.cheese + " Massa: " + pizza.dough +
	    			" Pepperoni: " + pizza.pepperoni + " Molho: " + pizza.sauce);
	 
	    System.out.println();
	 
	    pizzaria = new Pizzaria(new ChicagoPizzaBuilder());
	    pizzaria.construirPizza();
	    pizza = pizzaria.getPizza();
	    System.out.println("Pizza: Queijo " + pizza.cheese + " Massa: " + pizza.dough +
    			" Pepperoni: " + pizza.pepperoni + " Molho: " + pizza.sauce);
	}
}