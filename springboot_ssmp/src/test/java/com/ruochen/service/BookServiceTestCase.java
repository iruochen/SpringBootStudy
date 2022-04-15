package com.ruochen.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruochen.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(2));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(15);
        book.setType("测试数据bbb");
        book.setName("测试数据bbb");
        book.setDescription("测试数据");
        bookService.updateById(book);
    }

    @Test
    void testDelete() {
        bookService.removeById(14);
    }

    @Test
    void testGetAll() {
        bookService.list();
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(2, 5);
        bookService.page(page);
        System.out.println(page.getRecords());
    }
}
