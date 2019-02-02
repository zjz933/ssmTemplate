package com.njupt.service.impl;

import com.njupt.dao.BookMapper;
import com.njupt.entity.BookEntity;
import com.njupt.service.BookService;
import com.njupt.service.bo.BookBo;
import com.njupt.utils.Converters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojunzhi on 2019/2/2.
 */
@Service
public class BookServiceImpl implements BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookMapper bookMapper;

    public BookBo loadBookById(long bookId) {
        LOGGER.error("loadBookById...bookId = {}", bookId);
        BookEntity bookEntity = bookMapper.loadBookById(bookId);
        if (bookEntity == null) {
            return null;
        }
        return Converters.bookEntity2Bo(bookEntity);
    }
}
