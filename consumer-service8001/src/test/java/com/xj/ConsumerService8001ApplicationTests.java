package com.xj;

import com.xj.feign.RedisFeignInterface;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerService8001ApplicationTests {
    @Autowired
    private RedisFeignInterface rf;

    @Test
    void contextLoads() {
        boolean set = rf.set("aa", "bb", 300);

    }

}
