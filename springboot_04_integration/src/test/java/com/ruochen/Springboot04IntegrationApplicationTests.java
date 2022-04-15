package com.ruochen;

import com.ruochen.dao.AccountDao;
import com.ruochen.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04IntegrationApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AccountDao accountDao;

    @Test
    void contextLoads() {
        System.out.println("test ....");
    }

    @Test
    void testSave() {
        bookDao.save();
    }

    @Test
    void testAccountGetById() {
        System.out.println(accountDao.getById(2));
    }

    /*
    @Test
    void testSelectById() {
        System.out.println(accountDao.selectById(2));
    }
    */

}
