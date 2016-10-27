package handler.impl;

/**
 * Created by vladimir on 10/25/16.
 */
public class ThreeNumberHandler extends BaseHandler {

    @Override
    public String handle(String value) {
        value = value + 3;
        return super.handle(value);
    }
}
