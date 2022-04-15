package com.ruochen.dao.impl;

import com.ruochen.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("save ....");
    }
}
