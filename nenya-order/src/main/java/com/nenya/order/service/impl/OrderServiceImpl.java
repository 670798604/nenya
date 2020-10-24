package com.nenya.order.service.impl;

import com.nenya.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author mingyang.ma created on 2020-09-30
 * @version 1.0.0
 * @description TODO
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public Long getOrderById(Long id) {
        log.info("订单实现类接收参数:{}", id);
        return id + 1L;
    }
}
