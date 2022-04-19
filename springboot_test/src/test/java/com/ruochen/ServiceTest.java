package com.ruochen;

import com.ruochen.domain.Book;
import com.ruochen.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
// 回滚
// @Rollback(true)
public class ServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("springboot2");
        book.setType("springboot2");
        book.setDescription("springboot2");
        bookService.save(book);
    }

}
