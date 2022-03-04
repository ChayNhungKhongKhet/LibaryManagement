/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.service;

import com.java.dao.BookDao;
import com.java.entity.Book;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BookService {
    private BookDao bookDao;
    
    public BookService() {
        bookDao = new BookDao();
    }
    public List<Book> findAll() {
        return bookDao.findAll();
    }
    
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }
    
    public List<Book> findByAuthor(String author) {
        return bookDao.findByAuthor(author);
    }
    
    
    
    
    
}
