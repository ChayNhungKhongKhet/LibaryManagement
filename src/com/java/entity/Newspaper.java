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
public class Newspaper extends Document{
    private String releaseDate;

    public Newspaper(String releaseDate, Integer id, String producer, Integer releaseNumber) {
        super(id, producer, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public Newspaper() {
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.releaseDate);
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
        final Newspaper other = (Newspaper) obj;
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Newspaper{" + "releaseDate=" + releaseDate + '}';
    }
    
    
}
