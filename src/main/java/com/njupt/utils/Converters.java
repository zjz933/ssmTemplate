package com.njupt.utils;

import com.njupt.controller.vo.BookVo;
import com.njupt.entity.BookEntity;
import com.njupt.service.bo.BookBo;
import org.springframework.beans.BeanUtils;

/**
 * Created by zhaojunzhi on 2019/2/2.
 */
public class Converters {

    public static BookBo bookEntity2Bo(BookEntity entity) {
        BookBo bookBo = new BookBo();
        BeanUtils.copyProperties(entity, bookBo);
        return bookBo;
    }

    public static BookVo bookBo2Vo(BookBo bookBo) {
        BookVo bookVo = new BookVo();
        BeanUtils.copyProperties(bookBo, bookVo);
        return bookVo;
    }
}
