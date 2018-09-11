public class Pizzaria {
	protected PizzaBuilder pizza;
	 
    public Pizzaria(PizzaBuilder pizza) {
        this.pizza = pizza;
    }
 
    public void construirPizza() {
        pizza.createCheese();
        pizza.createClam();
        pizza.createDough();
        pizza.createPepperoni();
        pizza.createSauce();
        pizza.createVeggies();
    }
 
    public PizzaProduto getPizza() {
        return pizza.getPizza();
    }
}