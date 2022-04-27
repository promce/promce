package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> getAllBooks();
}
