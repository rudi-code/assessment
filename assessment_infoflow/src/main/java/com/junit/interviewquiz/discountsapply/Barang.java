/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.discountsapply;

import java.math.BigInteger;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Barang {
    private String nama;
    private BigInteger harga;
    private String jenis;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigInteger getHarga() {
        return harga;
    }

    public void setHarga(BigInteger harga) {
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nama);
        hash = 83 * hash + Objects.hashCode(this.harga);
        hash = 83 * hash + Objects.hashCode(this.jenis);
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
        final Barang other = (Barang) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.harga, other.harga)) {
            return false;
        }
        if (!Objects.equals(this.jenis, other.jenis)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barang{" + "nama=" + nama + ", harga=" + harga + ", jenis=" + jenis + '}';
    }

    
}
