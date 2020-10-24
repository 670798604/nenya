package com.nenya.payment.provider;

import com.nenya.common.response.CommonResult;
import com.nenya.payment.biz.PayBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingyang.ma created on 2020-09-29
 * @version 1.0.0
 * @description TODO
 */
@RestController
public class PayProvider {
    @Autowired
    private PayBiz payBiz;

    @GetMapping("/consumer/getPayStatus")
    public Long getPayStatusById(@RequestParam("id") Long id) {
        return payBiz.getById(id);
    }

}
