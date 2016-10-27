import caffe.Pizza;
import caffe.Waiter;
import caffe.pizzabuilder.HawaiianPizzaBuilder;
import caffe.pizzabuilder.PizzaBuilder;

/** A customer ordering a pizza. */
 public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
 }