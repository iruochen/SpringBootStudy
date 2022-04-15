package com.ruochen.dao;

import com.ruochen.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountDao {

    @Select("select * from account where id = #{id}")
    public Account getById(Integer id);
}
