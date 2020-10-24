package com.nenya.order.config;

import com.nenya.common.config.BaseSwaggerConfig;
import com.nenya.common.config.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author mingyang.ma created on 2020-10-12
 * @version 1.0.0
 * @description swagger 订单
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.nenya.order.controller")
                .title("嫩芽订单系统")
                .description("展示订单对外api展示")
                .contactName("mingyang.ma")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
