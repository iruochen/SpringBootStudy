package com.ruochen.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruochen.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("测试数据aaa");
        book.setName("测试数据aaa");
        book.setDescription("测试数据");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {

    }
}
