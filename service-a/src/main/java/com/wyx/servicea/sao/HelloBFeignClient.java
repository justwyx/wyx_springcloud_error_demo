package com.wyx.servicea.sao;

import com.wyx.serviceb.feign.HelloBFeign;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author : Just wyx
 * @Description : TODO 2020/8/27
 * @Date : 2020/8/27
 */
@FeignClient("service-b-feign")
public interface HelloBFeignClient extends HelloBFeign {
}
