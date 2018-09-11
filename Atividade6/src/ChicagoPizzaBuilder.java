import IngredientsPhysical.FreshClams;
import IngredientsPhysical.MarinaraSauce;
import IngredientsPhysical.ReggianoCheese;
import IngredientsPhysical.SlicedPepperoni;
import IngredientsPhysical.ThinCrustDough;

public class ChicagoPizzaBuilder extends PizzaBuilder {

	public void createDough() {
		pizza.dough = new ThinCrustDough();
	}

	public void createSauce() {
		pizza.sauce = new MarinaraSauce();
	}

	public void createCheese() {
		pizza.cheese = new ReggianoCheese();
	}

	public void createPepperoni() {
		pizza.pepperoni = new SlicedPepperoni();
	}

	public void createClam() {
		pizza.clam = new FreshClams();
	}

	@Override
	public void createVeggies() {

	}
	

}