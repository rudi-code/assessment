/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.discountsapply;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Pelanggan {
    
    private String nama;
    private String status;
    private Date entryDate;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nama);
        hash = 83 * hash + Objects.hashCode(this.status);
        hash = 83 * hash + Objects.hashCode(this.entryDate);
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
        final Pelanggan other = (Pelanggan) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.entryDate, other.entryDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pelanggan{" + "nama=" + nama + ", status=" + status + ", entryDate=" + entryDate + '}';
    }
    
}
