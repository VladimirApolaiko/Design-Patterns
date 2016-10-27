package decorator_example_1.decorator;

import decorator_example_1.component.InterfaceComponent;

public class DecoratorHello extends Decorator {

    public DecoratorHello(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}