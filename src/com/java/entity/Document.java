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
public abstract class Document {
    private Integer id;
    private String producer;
    private Integer releaseNumber;

    public Document(Integer id, String producer, Integer releaseNumber) {
        this.id = id;
        this.producer = producer;
        this.releaseNumber = releaseNumber;
    }

    public Document() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(Integer releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.producer);
        hash = 31 * hash + Objects.hashCode(this.releaseNumber);
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
        final Document other = (Document) obj;
        if (!Objects.equals(this.producer, other.producer)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.releaseNumber, other.releaseNumber)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Document{" + "id=" + id + ", producer=" + producer + ", releaseNumber=" + releaseNumber + '}';
    }
    
    
}
