/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.discountsapply.Barang;
import com.junit.interviewquiz.discountsapply.Pelanggan;
import java.math.BigInteger;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class DiscountsApplyTest {
    
    @Test
    public void testDiscountsApply() {
        
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("rudi");
        pelanggan.setStatus("employee");
        pelanggan.setEntryDate(new Date());
        
        Barang barang = new Barang();
        barang.setNama("kursi");
        barang.setJenis("groceries");
        barang.setHarga(new BigInteger("2000"));
        
        DiscountsApply da = new DiscountsApply();
        da.Test(pelanggan, barang);
    }
    
}
