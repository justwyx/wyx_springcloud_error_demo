package com.wyx.common.exception;



/**
 * @Description : 系统异常
 * @author : Just wyx
 * @Date : 2019/7/25
 */
public class SystemException extends ServiceException {

    public SystemException() {
        super("99999","服务器系统异常");
    }

    public SystemException(ErrorCode errCode) {
        super(errCode);
    }

    public SystemException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public SystemException(String message, String errorCode, String errorMsg) {
        super(message, errorCode, errorMsg);
    }

    public SystemException(String message, Throwable cause, String errorCode, String errorMsg) {
        super(message, cause, errorCode, errorMsg);
    }

    public SystemException(Throwable cause, String errorCode, String errorMsg) {
        super(cause, errorCode, errorMsg);
    }

    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMsg) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode, errorMsg);
    }
}
