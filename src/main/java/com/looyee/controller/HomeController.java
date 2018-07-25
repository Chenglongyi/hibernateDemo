package com.looyee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/index")
    public String index(){
        // 输出日志文件
        LOGGER.info("CurrentTime:{}"+System.currentTimeMillis());
        LOGGER.info("the first jsp pages");
        return "index";
    }
}
