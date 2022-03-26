package com.java.springsecurityjpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeResourceController.class);

    @GetMapping("/")
    public String home() {
        LOGGER.info("/ listing called");
        return ("<h1>Welcome to Normal Page</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User page</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin page</h1>");
    }
}
