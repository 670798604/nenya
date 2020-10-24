package com.nenya.order.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mingyang.ma created on 2020-09-29
 * @version 1.0.0
 * @description TODO
 */
@Component
@FeignClient(value = "nenya-pay")
public interface PayRemoteApi {
    @GetMapping("/consumer/getPayStatus")
    Long getPayStatusById(@RequestParam("id") Long id);
}
