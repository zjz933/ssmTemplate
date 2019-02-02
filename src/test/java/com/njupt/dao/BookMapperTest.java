package com.njupt.dao;

import com.njupt.BaseTest;
import com.njupt.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by zhaojunzhi on 2019/2/2.
 */
public class BookMapperTest extends BaseTest {

    @Autowired
    private BookMapper bookMapper;


    @Test
    public void test_select(){

        Book book = bookMapper.selectByPrimaryKey(1000L);
        Assert.assertTrue(book!=null);
    }


}