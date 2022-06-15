/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.discountsapply;

import com.junit.interviewquiz.discountsapply.Pelanggan;
import com.junit.interviewquiz.discountsapply.Barang;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author user
 */
public class Toko {
    private Pelanggan pelanggan;
    private Barang barang;
    private Double totalPembelian;
    private Double diskon;
    
    public void addPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    public void addBarang(Barang barang){
        this.barang = barang;
    }
    public String transaksi(Pelanggan pelangganBeli, Barang barang){
        if(barang.getJenis().equalsIgnoreCase("groceries")){
            totalPembelian = barang.getHarga().doubleValue();
        }else if(pelangganBeli.getStatus().equalsIgnoreCase("employee")){
            diskon = 0.3;
            totalPembelian = barang.getHarga().doubleValue()-(barang.getHarga().doubleValue()*diskon);
        }else if(pelangganBeli.getStatus().equalsIgnoreCase("affiliate")){
            diskon = 0.1;
            totalPembelian = barang.getHarga().doubleValue()-(barang.getHarga().doubleValue()*diskon);
        }else if((pelangganBeli.getEntryDate().getYear()-pelanggan.getEntryDate().getYear())>2){
            diskon = 0.05;
            totalPembelian = barang.getHarga().doubleValue()-(barang.getHarga().doubleValue()*diskon);
        }else if(barang.getHarga().intValue()>100){
            int a = barang.getHarga().intValue()/100;
            diskon = new Double(a*5);
            totalPembelian = barang.getHarga().doubleValue()-diskon;
        }
        System.out.println("transaksi "+barang.getNama()+" untuk pelanggan "+pelangganBeli.getNama()+" adalah : "+totalPembelian);
        return null; 
        
    }

    @Override
    public String toString() {
        return "Toko{" + "pelanggan=" + pelanggan + ", barang=" + barang + ", diskon=" + diskon + '}';
    }
    
    
}
