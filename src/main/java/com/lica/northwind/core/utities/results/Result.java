package com.lica.northwind.core.utities.results;

import lombok.Data;


@Data
public class Result {
    private  boolean success;
    private  String message;

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, String message) {
        this.isSuccess();
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
