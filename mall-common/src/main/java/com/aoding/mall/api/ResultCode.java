package com.aoding.mall.api;

public enum ResultCode implements IErrorCode{
    SUCCESS(200,"成功访问"),
    FAILED(500,"服务端错误"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");



    private long code;

    private String message;


    private ResultCode(long code , String message){
        this.code = code;
        this.message = message;
    }

    public long getCode(){return code;};

    public String getMessage(){return message;};


}
