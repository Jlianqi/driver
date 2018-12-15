package com.driver_java.result;

public class Result<T> {
    private ResultCodeEnum codeEnum;
    private String message;
    private T data;

    public Result() {
    }

    public Result setCodeEnum(ResultCodeEnum codeEnum) {
        this.codeEnum = codeEnum;
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public ResultCodeEnum getCodeEnum() {
        return codeEnum;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
