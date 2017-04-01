package cn.py.test;

import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class TestLog {

    private static Logger logger = Logger.getLogger(TestLog.class);

    public static void main(String[] args) {
        logger.info("begin info");
        logger.error("begin error");
        logger.warn("begin warn");

    }

}
