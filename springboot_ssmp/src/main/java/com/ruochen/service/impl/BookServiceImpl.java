package com.ruochen.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruochen.dao.BookDao;
import com.ruochen.domain.Book;
import com.ruochen.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
