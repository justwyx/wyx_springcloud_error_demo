package com.wyx.common.exception;


import java.text.MessageFormat;

/**
 * @Description : 异常基类，运行时异常
 * @author : Just wyx
 * @Date : 2019/7/24
 */
public class ServiceException extends RuntimeException {

    /**
     * 错误code
     */
    private String errorCode;

    /**
     * 错误message
     */
    private String errorMsg;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ServiceException(ErrorCode errCode) {
        this(errCode.getCode(), errCode.getMsg());
    }

    public ServiceException(ErrorCode errCode, String... msg) {
        this(errCode.getCode(), MessageFormat.format(errCode.getMsg(), msg));
    }

    public ServiceException(String errorCode, String errorMsg) {
        super("errorCode:" + errorCode + ",errorMsg:" + errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ServiceException(String message, String errorCode, String errorMsg) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ServiceException(String message, Throwable cause, String errorCode, String errorMsg) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ServiceException(Throwable cause, String errorCode, String errorMsg) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMsg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    @Override
    public String toString() {
        return "ServiceException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}