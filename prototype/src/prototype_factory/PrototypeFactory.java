package prototype_factory;

public interface PrototypeFactory {
    <T extends Copyable<T>> T makePrototype(T object);
}
