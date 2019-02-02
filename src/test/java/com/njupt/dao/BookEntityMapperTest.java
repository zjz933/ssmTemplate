package com.njupt.dao;

import com.njupt.BaseTest;
import com.njupt.entity.BookEntity;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by zhaojunzhi on 2019/2/2.
 */
public class BookEntityMapperTest extends BaseTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test_loadBook() {
        BookEntity bookEntity = bookMapper.loadBookById(1003L);
        Assert.assertTrue(bookEntity != null);
    }

    @Test
    public void test_addBook() {
        BookEntity entity = new BookEntity();
        entity.setName("测试书籍");
        entity.setNumber(10);
        int addResult = bookMapper.addBook(entity);
        Assert.assertTrue(addResult > 0);
    }

}