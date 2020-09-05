package com.wyx.common.enums;

import com.wyx.common.exception.ErrorCode;

/**
 * @author : Just wyx
 * @Description : TODO 2020/8/26
 * @Date : 2020/8/26
 */
public enum  BusinessErrorEnum implements ErrorCode {
	OK("10000", "请求成功"),

	CHECK_SKU_100001("EDS_10001", "参数异常:{0}");


	private String msg;
	private String code;

	BusinessErrorEnum(String msg, String code) {
		this.msg = msg;
		this.code = code;
	}

	@Override
	public String getMsg() {
		return this.msg;
	}

	@Override
	public String getCode() {
		return this.code;
	}
}
