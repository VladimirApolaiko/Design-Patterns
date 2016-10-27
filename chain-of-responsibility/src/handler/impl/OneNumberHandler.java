package handler.impl;

/**
 * Created by vladimir on 10/25/16.
 */
public class OneNumberHandler extends BaseHandler {

    @Override
    public String handle(String value) {
        value = value + 1;
        return super.handle(value);
    }

}
