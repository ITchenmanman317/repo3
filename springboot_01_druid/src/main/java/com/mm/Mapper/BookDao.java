package com.mm.Mapper;

import com.mm.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from user where id=#{id}")
    public Book getById(Integer id);
}
