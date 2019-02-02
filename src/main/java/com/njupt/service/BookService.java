package com.njupt.service;

import com.njupt.entity.Book;

/**
 * Created by zhaojunzhi on 2019/2/2.
 */
public interface BookService {

    Book loadBookById(long bookId);
}
