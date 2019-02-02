package com.njupt.controller;

import com.njupt.entity.Book;
import com.njupt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaojunzhi on 2019/2/1.
 */
@Controller
public class HelloController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/hello")
    @ResponseBody
    public Book hello() {
        return bookService.loadBookById(1000L);
    }
}
