package com.njupt.dao;

import com.njupt.entity.BookEntity;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {

    BookEntity loadBookById(@Param("id") long id);

    int addBook(@Param("entity") BookEntity entity);
}