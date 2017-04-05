package cn.py.controller.wechat;

import cn.py.common.utils.SignUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/5 0005.
 */

@Controller
public class AccessToken {

    private static Logger log = Logger.getLogger(AccessToken.class);

    private String appid = "wx88e2dfcec5dc888f";
    private String appsecret = "5d5862be2ecc15748c8b3cd1c5b651c2";
    private String access_token = "nothing_py";

    @RequestMapping("/py/get/token")
    @ResponseBody
    public void getToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
            System.out.println("微信服务验证成功！");
        }
        out.close();
        out = null;
    }
}
