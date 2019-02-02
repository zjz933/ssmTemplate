package com.njupt.controller;

import com.njupt.controller.vo.BookVo;
import com.njupt.service.BookService;
import com.njupt.service.bo.BookBo;
import com.njupt.utils.Converters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaojunzhi on 2019/2/1.
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/load")
    @ResponseBody
    public BookVo loadBook(long bookId) {
        BookBo bookBo = bookService.loadBookById(bookId);
        if (bookBo == null) {
            return null;
        }
        return Converters.bookBo2Vo(bookBo);
    }
}
