package com.hhjcq.application_access.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeoutController {
    @Value("${timeout}")
    private int timeout;

    @GetMapping("/timeout")
    private int getTimeout() {
        return timeout;
    }
}
