package handler.impl;

/**
 * Created by vladimir on 10/25/16.
 */
public class TwoNumberHandler extends BaseHandler {

    @Override
    public String handle(String value) {
        value = value + 2;
        return super.handle(value);
    }
}
