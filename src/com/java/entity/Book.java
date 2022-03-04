/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.entity;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Book extends Document{
    private String author;
    private Integer numberOfPages;

    public Book(String author, Integer numberOfPages, Integer id, String producer, Integer releaseNumber) {
        super(id, producer, releaseNumber);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + Objects.hashCode(this.numberOfPages);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.numberOfPages, other.numberOfPages)) {
            return false;
        }
        return true;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", numberOfPages=" + numberOfPages + '}';
    }
    
    
    
    
}
