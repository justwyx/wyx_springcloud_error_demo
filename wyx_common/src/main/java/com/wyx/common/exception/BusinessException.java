package com.wyx.common.exception;



/**
 * @Description : 业务异常
 * @author : Just wyx
 * @Date : 2019/7/25
 */
public class BusinessException extends ServiceException{

    public BusinessException() {
        super("99999","服务器业务异常");
    }


    public BusinessException(ErrorCode errorCode) {
        super(errorCode);
    }

    public BusinessException(ErrorCode errorCode, String... msg) {
        super(errorCode, msg);
    }

    public BusinessException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public BusinessException(String message, String errorCode, String errorMsg) {
        super(message, errorCode, errorMsg);
    }

    public BusinessException(String message, Throwable cause, String errorCode, String errorMsg) {
        super(message, cause, errorCode, errorMsg);
    }

    public BusinessException(Throwable cause, String errorCode, String errorMsg) {
        super(cause, errorCode, errorMsg);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMsg) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode, errorMsg);
    }
}
