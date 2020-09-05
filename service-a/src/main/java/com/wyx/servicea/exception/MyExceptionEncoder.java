package com.wyx.servicea.exception;

import com.wyx.common.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description : 全局异常信息转成应答对象
 * @author : Just wyx
 * @Date : 2019/7/25
 */
@ControllerAdvice
public class MyExceptionEncoder {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public String handleBusinessException(BusinessException e) {
        logger.error("业务异常:[{}]", e);

        return e.getMessage();
    }


    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleUnknownxception(Exception e) {
        logger.error("系统异常:[{}]", e);
        return e.getMessage();
    }
}
