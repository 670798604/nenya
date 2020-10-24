package com.nenya.auth.controller;

import cn.hutool.core.util.StrUtil;
import io.jsonwebtoken.Jwts;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * @author mingyang.ma created on 2020-10-22
 * @version 1.0.0
 * @description 认证授权
 */
@RestController
@RequestMapping("/user")
@Api(tags = "UserController", description = "认证授权")
public class UserController {
    @GetMapping("/getCurrentUser")
    @ApiOperation(value = "获取当前用户")
    public Object getCurrentUser(Authentication authentication, HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        String token = StrUtil.subAfter(header, "bearer ", false);
        return Jwts.parser()
                .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(token)
                .getBody();
    }
}