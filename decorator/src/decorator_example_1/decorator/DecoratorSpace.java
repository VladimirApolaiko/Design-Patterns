package decorator_example_1.decorator;

import decorator_example_1.component.InterfaceComponent;

public class DecoratorSpace extends Decorator {

    public DecoratorSpace(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}