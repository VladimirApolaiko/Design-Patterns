package adapter;

import adaptee.SimpleHttpRequest;

import java.util.List;

public interface AdapterInterface {

    SimpleHttpRequest buildRequest(String method, byte[] bodyData, List<String> headers);

}