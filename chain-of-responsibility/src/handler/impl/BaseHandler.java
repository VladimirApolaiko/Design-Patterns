package handler.impl;


import handler.IHandler;

public abstract class BaseHandler implements IHandler {

    public static IHandler buildChain(IHandler... handlers) {
        IHandler first = handlers[0];
        IHandler current = first;

        for (int i = 0; i < handlers.length - 1; i++) {
            IHandler nextHandler = handlers[i + 1];

            current.setNext(nextHandler);
            current = nextHandler;
        }

        return first;
    }

    private IHandler next;

    @Override
    public String handle(String value) {
        if(next == null) return value;

        return next.handle(value);
    }

    public void setNext(IHandler next) {
        this.next = next;
    }
}
