/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.discountsapply.Toko;
import com.junit.interviewquiz.discountsapply.Pelanggan;
import com.junit.interviewquiz.discountsapply.Barang;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author user
 */
public class DiscountsApply {
    
    public void Test(Pelanggan pelanggan, Barang barang) {

        Toko toko = new Toko();
        toko.addPelanggan(pelanggan);
        toko.transaksi(pelanggan, barang);
        
    }
}
