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
public class Magazine extends Document{
    private Integer issueNumber;
    private String releaseMonth;

    public Magazine(Integer issueNumber, String releaseMonth, Integer id, String producer, Integer releaseNumber) {
        super(id, producer, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.issueNumber);
        hash = 59 * hash + Objects.hashCode(this.releaseMonth);
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
        final Magazine other = (Magazine) obj;
        if (!Objects.equals(this.releaseMonth, other.releaseMonth)) {
            return false;
        }
        if (!Objects.equals(this.issueNumber, other.issueNumber)) {
            return false;
        }
        return true;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    
    @Override
    public String toString() {
        return "Magazine{" + "issueNumber=" + issueNumber + ", releaseMonth=" + releaseMonth + '}';
    }
    
    
}
