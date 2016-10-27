import command.Invoker;

/**
 * Created by vladimir on 10/26/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Invoker invoker = new Invoker();
        invoker.invokeWithTimer(() -> System.out.println("hello"), 2000);
        invoker.invokeWithPeriod(() -> System.out.println("hello world"), 500);
    }
}
