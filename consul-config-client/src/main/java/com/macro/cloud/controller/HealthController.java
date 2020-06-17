package com.macro.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.User;

@RestController
@RequestMapping("/actuator")
public class HealthController {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/health")
    public CommonResult getHealthState() {
        LOGGER.info("收到Consul发过来的健康检查探针信息");
        return new CommonResult();
    }
}
