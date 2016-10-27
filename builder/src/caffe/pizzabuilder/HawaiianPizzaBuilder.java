package caffe.pizzabuilder;

/**
 * "ConcreteBuilder"
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public PizzaBuilder buildDough() {
        pizza.setDough("cross");
        return this;
    }

    public PizzaBuilder buildSauce() {
        pizza.setSauce("mild");
        return this;
    }

    public PizzaBuilder buildTopping() {
        pizza.setTopping("ham+pineapple");
        return this;
    }
}

