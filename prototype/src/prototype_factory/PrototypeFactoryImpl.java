package prototype_factory;

public class PrototypeFactoryImpl implements PrototypeFactory {

    @Override
    public <T extends Copyable<T>> T makePrototype(T object) {
        return object.copy();
    }
}
