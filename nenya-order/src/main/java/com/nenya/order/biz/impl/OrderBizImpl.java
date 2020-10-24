package com.nenya.order.biz.impl;

import com.nenya.order.biz.OrderBiz;
import com.nenya.order.remote.PayRemoteApi;
import com.nenya.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mingyang.ma created on 2020-09-30
 * @version 1.0.0
 * @description TODO
 */
@Service
@Slf4j
public class OrderBizImpl implements OrderBiz {
    @Autowired
    private OrderService orderService;
    @Autowired
    private PayRemoteApi payRemoteApi;

    @Override
    public Long getId(Long id) {
        log.info("订单接收到参数:{}", id);
        Long orderId = orderService.getOrderById(id);
        log.info("调用支付参数:{}", id);
        Long payId = payRemoteApi.getPayStatusById(orderId);
        log.info("调用支付完成");
        return payId;
    }
}
