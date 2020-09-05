package com.wyx.serviceb.controller;

import com.wyx.common.enums.BusinessErrorEnum;
import com.wyx.common.exception.BusinessException;
import com.wyx.serviceb.feign.HelloBFeign;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Just wyx
 * @Description : TODO 2020/8/27
 * @Date : 2020/8/27
 */
@RestController
public class HelloBController implements HelloBFeign {

	@Override
	public String hello() {
		return "hello world-b";
	}

	@Override
	public String error() {
		if (true) {
			throw new BusinessException(BusinessErrorEnum.CHECK_SKU_100001);
		}
		return "error";
	}
}
