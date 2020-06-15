package com.macro.cloud.domain;

import lombok.Data;

/**
 * Created by macro on 2019/8/29.
 */
@Data
public class CommonResult<T> {
    private T data;
    private String message;
    private Integer code;

    public CommonResult(){}

    public CommonResult(T data, String message, Integer code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public CommonResult(String message, Integer code) {
        this(null, message, code);
    }

    public CommonResult(T data) {
        this(data, "操作成功", 200);
    }
}