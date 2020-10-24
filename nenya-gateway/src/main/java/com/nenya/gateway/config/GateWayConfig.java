//package com.nenya.gateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author mingyang.ma created on 2020-10-23
// * @version 1.0.0
// * @description 网关配置
// */
//@Configuration
//public class GateWayConfig {
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route2", r -> r.path("/user/getByUsername")
//                        .uri("http://localhost:8201/user/getByUsername"))
//                .build();
//    }
//}
