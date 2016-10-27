package com.singleton;

import com.singleton.lazy.LazySingleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();

        lazySingleton.sayHello();
    }
}
