package com.nenya.order.controller;

import com.nenya.common.response.CommonResult;
import com.nenya.order.biz.OrderBiz;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingyang.ma created on 2020-09-23
 * @version 1.0.0
 * @description 订单controller
 */
@Api(tags = "OrderController", description = "订单接口")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderBiz orderBiz;

    @ApiOperation(value = "订单列表")
    @GetMapping(value = "list")
    public CommonResult<String> list(int pageNum, int pageSize) {
        return CommonResult.success("订单列表当前页：" + pageNum + "，每页条数：" + pageSize);
    }

    @ApiOperation(value = "根据订单id查找")
    @GetMapping(value = "getById")
    public CommonResult<Long> getById(@RequestParam("id") Long id) {
        return CommonResult.success(orderBiz.getId(id));
    }
}
