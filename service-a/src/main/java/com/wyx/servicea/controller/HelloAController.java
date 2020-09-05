package com.wyx.servicea.controller;

import com.wyx.servicea.sao.HelloBFeignClient;
import com.wyx.serviceb.feign.HelloBFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description : TODO 2020/8/27
 * @author : Just wyx
 * @Date : 2020/8/27
 */
@RestController
public class HelloAController {

	@Resource
	private HelloBFeignClient helloBFeignClient;

	@GetMapping(value = "/a/hello")
	public String getHello() {
		return helloBFeignClient.hello();
	}

	@GetMapping(value = "/a/error")
	public String getError() {
		return helloBFeignClient.error();
	}
}
