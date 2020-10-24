package com.nenya.payment.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author mingyang.ma created on 2020-09-22
 * @version 1.0.0
 * @description 支付参数
 */
@Data
public class PayDto {
    /**
     * 支付金额
     */
    private BigDecimal amount;
    /**
     * 支付类型
     */
    private Integer type;
}
