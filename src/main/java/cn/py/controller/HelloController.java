package cn.py.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/30 0030.
 */


@Controller
public class HelloController {

    private static Logger log = Logger.getLogger(HelloController.class);

    @RequestMapping("/py/hello")
    @ResponseBody
    public Map hello() {
        System.out.println("begin hello ");
        Map<String, Object> map = new HashMap<>();

        String access_token = "nothing_py";

        map.put("access_token", access_token);
        map.put("expires_in", 7200);

        log.info("begin hello info");
        return map;
    }
}
