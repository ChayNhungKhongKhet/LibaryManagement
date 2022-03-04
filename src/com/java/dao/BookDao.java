/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.dao;

import com.java.connection.MyConnection;
import com.java.entity.Book;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BookDao {

    public List<Book> findAll() {
        Connection con = new MyConnection().getConnection();

        List<Book> books = new ArrayList<>();

        String sql = "select * from Book order by id asc";

        try {
            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Book book = new Book();

                book.setId(rs.getInt("id"));
                book.setProducer(rs.getString("producer"));
                book.setAuthor(rs.getString("author"));
                book.setReleaseNumber(rs.getInt("releaseNumber"));
                book.setNumberOfPages(rs.getInt("numberOfPages"));
                books.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return books;
    }

    public Book findById(Integer id) {
        Connection con = new MyConnection().getConnection();

        String sql = "select * from Book where id = " + id;
        Book book = new Book();

        try {
            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                book.setId(rs.getInt("id"));
                book.setProducer(rs.getString("producer"));
                book.setAuthor(rs.getString("author"));
                book.setReleaseNumber(rs.getInt("releaseNumber"));
                book.setNumberOfPages(rs.getInt("numberOfPages"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return book;
    }

    public List<Book> findByAuthor(String author) {
        Connection con = new MyConnection().getConnection();

        List<Book> books = new ArrayList<>();

        String sql = "select * from Book where author = "+author +" order by id asc";

        try {
            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Book book = new Book();

                book.setId(rs.getInt("id"));
                book.setProducer(rs.getString("producer"));
                book.setAuthor(rs.getString("author"));
                book.setReleaseNumber(rs.getInt("releaseNumber"));
                book.setNumberOfPages(rs.getInt("numberOfPages"));
                books.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return books;
    }
    
    

    public boolean deleteById(Integer id) {
        Connection con = new MyConnection().getConnection();
        String sql = "delete * from Book where id = " + id;
        int rs;

        try {
            Statement statement = con.createStatement();

            rs = statement.executeUpdate(sql);
            return rs != 0;

        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

    public boolean save(Book book) {
        Connection con = new MyConnection().getConnection();
        String sql = "insert into Book (producer,releaseNumber,author,numberOfPages) "
                + "values(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, book.getProducer());
            preparedStatement.setInt(2, book.getReleaseNumber());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setInt(4, book.getNumberOfPages());
            int rs = preparedStatement.executeUpdate();
            return rs != 1;
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
