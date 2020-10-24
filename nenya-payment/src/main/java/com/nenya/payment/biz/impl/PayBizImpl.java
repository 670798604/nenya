package com.nenya.payment.biz.impl;

import com.nenya.payment.biz.PayBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author mingyang.ma created on 2020-09-29
 * @version 1.0.0
 * @description TODO
 */
@Service
@Slf4j
public class PayBizImpl implements PayBiz {
    @Override
    public Long getById(Long id) {
        log.info("支付服务接收到参数{}", id);
        return (id * 20L);
    }
}
