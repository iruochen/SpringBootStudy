package com.ruochen.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruochen.domain.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao extends BaseMapper<Account> {
}
