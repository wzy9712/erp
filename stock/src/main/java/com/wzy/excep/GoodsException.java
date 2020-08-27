package com.wzy.excep;

public class GoodsException extends RuntimeException {
    public GoodsException() {
        super();
    }

    public GoodsException(String message) {
        super(message);
    }
}