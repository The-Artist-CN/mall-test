package com.aoding.mall.api;

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


}
