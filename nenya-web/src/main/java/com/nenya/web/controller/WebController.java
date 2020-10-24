package com.nenya.web.controller;

import com.nenya.common.response.CommonResult;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingyang.ma created on 2020-09-22
 * @version 1.0.0
 * @description web controller
 */
@RestController
@RequestMapping("/portal")
@RefreshScope
public class WebController {
    @Value("${rsa.publickey}")
    public String publicKey;

    @GetMapping(value = "list")
    public CommonResult<String> test(@RequestParam("billId") String billId,
                                     @RequestParam("channel") String channel) {
        return CommonResult.success(billId.concat(channel));
    }

    @GetMapping("/publicKey")
    public CommonResult<String> getPublicKey() {
        return CommonResult.success(this.publicKey);
    }
}
