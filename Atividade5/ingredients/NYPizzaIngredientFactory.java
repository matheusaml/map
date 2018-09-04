package ingredients;

import IngredientsAbstract.Cheese;
import IngredientsAbstract.Dough;
import IngredientsAbstract.Sauce;
import IngredientsAbstract.Pepperoni;
import IngredientsAbstract.Clams;
import IngredientsAbstract.Carrot;
import IngredientsAbstract.Tomatoes;
import IngredientsAbstract.Potatoes;

import IngredientsPhysical.DicedPepperoni;
import IngredientsPhysical.FrozenClams;
import IngredientsPhysical.MozzarellaCheese;
import IngredientsPhysical.PlumTomatoSauce;
import IngredientsPhysical.ThickCrustDough;
import IngredientsPhysical.BakedPotatoes;
import IngredientsPhysical.GrilledTomatoes;
import IngredientsPhysical.MicrowavedCarrots;
  
  public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    	public Dough createDough() {
    		return new ThickCrustDough();
    	}

    	public Sauce createSauce() {
    		return new PlumTomatoSauce();
    	}

    	public Cheese createCheese() {
    		return new MozzarellaCheese();
    	}

    	public Veggies[] createVeggies() {
    		Veggies veggies[] = { new BakedPotatoes(),
    		                      new MicrowavedCarrots(),
    		                      new GrilledTomatoes() };
    		return veggies;
    	}

    	public Pepperoni createPepperoni() {
    		return new DicedPepperoni();
    	}

    	public Clams createClam() {
    		return new FrozenClams();
    	}
  }