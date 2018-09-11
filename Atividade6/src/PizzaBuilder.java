import IngredientsAbstract.Cheese;
import IngredientsAbstract.Clams;
import IngredientsAbstract.Dough;
import IngredientsAbstract.Pepperoni;
import IngredientsAbstract.Sauce;

public abstract class PizzaBuilder {
	
	protected PizzaProduto pizza = new PizzaProduto();
	
	public abstract void createDough();
	public abstract void createSauce();
	public abstract void createCheese();
	public abstract void createVeggies();
	public abstract void createPepperoni();
	public abstract void createClam();
  	
  	public PizzaProduto getPizza() {
  		return pizza;
  	}

}
