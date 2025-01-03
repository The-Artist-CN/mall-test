package com.aoding.mall.api;

import javax.xml.transform.Result;

public class CommonResult<T>{
    /*错误状态码*/
    private long code;

    private String message;

    private T data;

    protected CommonResult(){};

    protected CommonResult(long code , String message , T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }
    public static <T> CommonResult<T> success(String message , T data){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),message,data);
    }
    public static <T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<>(errorCode.getCode(),errorCode.getMessage(),null);
    }
    public static <T> CommonResult<T> failed(IErrorCode errorCode ,String message){
        return new CommonResult<>(errorCode.getCode(),message,null);
    }
    public static <T> CommonResult<T> failid(String message){
        return new CommonResult<>(ResultCode.FAILED.getCode(), message,null);
    }
    public static <T> CommonResult<T> failed(){
        return failed(ResultCode.FAILED);
    }
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
