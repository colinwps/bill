package com.colinapp.colinwng;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ColinwngApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {

        logger.trace("这是trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("123456");
        logger.error("error");
    }

}
