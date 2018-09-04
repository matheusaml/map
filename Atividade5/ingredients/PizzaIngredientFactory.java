package ingredients;

import IngredientsAbstract.Cheese;
import IngredientsAbstract.Dough;
import IngredientsAbstract.Sauce;
import IngredientsAbstract.Pepperoni;
import IngredientsAbstract.Clams;

public interface PizzaIngredientFactory {

  	public Dough createDough();
  	public Sauce createSauce();
  	public Cheese createCheese();
  	public Veggies[] createVeggies();
  	public Pepperoni createPepperoni();
  	public Clams createClam();

  }