package com.nenya.payment.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.nenya.common.response.CommonResult;
import com.nenya.payment.biz.PayBiz;
import com.nenya.payment.domain.dto.PayDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author mingyang.ma created on 2020-09-22
 * @version 1.0.0
 * @description 支付Controller
 */
@RestController
@RequestMapping("/payment")
public class PayController {
    @Autowired
    private PayBiz payBiz;

    @PostMapping(value = "pay")
    public CommonResult<String> pay(@RequestBody PayDto payDto) {
        return CommonResult.success(JSONUtil.toJsonStr(payDto));
    }

    @GetMapping("/getPayStatus")
    public CommonResult<Long> getPayStatusById(@RequestParam("id") Long id) {
        return CommonResult.success(payBiz.getById(id));
    }
}
