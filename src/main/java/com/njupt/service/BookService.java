package com.njupt.service;

import com.njupt.service.bo.BookBo;

/**
 * Created by zhaojunzhi on 2019/2/2.
 */
public interface BookService {

    /**
     * 根据bookId查找Book信息
     *
     * @param bookId
     * @return
     */
    BookBo loadBookById(long bookId);
}
