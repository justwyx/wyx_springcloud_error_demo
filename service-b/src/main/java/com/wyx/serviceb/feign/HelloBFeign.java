package com.wyx.serviceb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description : TODO 2020/8/27
 * @author : Just wyx
 * @Date : 2020/8/27
 */
@FeignClient("service-b-feign")
public interface HelloBFeign {
	@GetMapping(value = "hello")
	String hello();

	@GetMapping(value = "getError")
	String error();
}
