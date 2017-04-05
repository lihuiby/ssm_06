package cn.py.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/3/30 0030.
 */


@Controller
public class HelloController {

    private static Logger log = Logger.getLogger(HelloController.class);

    @RequestMapping("/py/hello")
    @ResponseBody
    public String hello() {
        System.out.println("begin hello");

        log.info("begin hello info");
        return "ok";
    }
}
