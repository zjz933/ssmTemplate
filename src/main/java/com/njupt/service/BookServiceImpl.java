package com.njupt.service;

import com.njupt.dao.BookMapper;
import com.njupt.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojunzhi on 2019/2/2.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public Book loadBookById(long bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }
}
