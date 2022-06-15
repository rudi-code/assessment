/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.storeandload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Store {
    
    private String text;

    public String Store(HashMap<String,String>[] a) {
        text = proses(a);
        return text; 
    }

    private String proses(HashMap<String,String>[] a) {
        String concat = "";
        for (HashMap h : a) {
            concat += h.toString().replace("{", "").replace(", ", ";").replace("}", "").concat("\n");  
        }
        return concat;
    }

    
    

    
    
}
