package com.njupt;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by zhaojunzhi on 2019/2/2.
 */
@ContextConfiguration(locations = {
        "classpath*:spring/spring-*.xml"})
public class BaseTest extends AbstractJUnit4SpringContextTests {

}
