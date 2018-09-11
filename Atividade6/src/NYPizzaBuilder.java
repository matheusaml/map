import IngredientsAbstract.Cheese;
import IngredientsAbstract.Clams;
import IngredientsAbstract.Dough;
import IngredientsAbstract.Pepperoni;
import IngredientsAbstract.Sauce;
import IngredientsAbstract.Veggies;
import IngredientsPhysical.BakedPotatoes;
import IngredientsPhysical.DicedPepperoni;
import IngredientsPhysical.FrozenClams;
import IngredientsPhysical.GrilledTomatoes;
import IngredientsPhysical.MicrowavedCarrots;
import IngredientsPhysical.MozzarellaCheese;
import IngredientsPhysical.PlumTomatoSauce;
import IngredientsPhysical.ThickCrustDough;

public class NYPizzaBuilder extends PizzaBuilder {

	public void createDough() {
		pizza.dough = new ThickCrustDough();
	}

	public void createSauce() {
		pizza.sauce = new PlumTomatoSauce();
	}

	public void createCheese() {
		pizza.cheese = new MozzarellaCheese();
	}

	public void createPepperoni() {
		pizza.pepperoni = new DicedPepperoni();
	}

	public void createClam() {
		pizza.clam = new FrozenClams();
	}

	@Override
	public void createVeggies() {

	}
	

}
