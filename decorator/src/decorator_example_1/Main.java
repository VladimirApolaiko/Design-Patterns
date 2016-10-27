package decorator_example_1;

import decorator_example_1.component.MainComponent;
import decorator_example_1.decorator.Decorator;
import decorator_example_1.decorator.DecoratorComma;
import decorator_example_1.decorator.DecoratorHello;
import decorator_example_1.decorator.DecoratorSpace;

class Main {
    public static void main(String... s) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation
    }
}