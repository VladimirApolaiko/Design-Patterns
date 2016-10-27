package handler.impl;


import handler.IHandler;

import java.util.List;

public abstract class BaseHandler implements IHandler {

    public static IHandler buildChain(List<BaseHandler> handlers) {
        BaseHandler first = handlers.get(0);
        BaseHandler current = first;
        for (int i = 0; i < handlers.size() - 1; i++) {
            current.setNext(handlers.get(i + 1));
            current = handlers.get(i + 1);
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
