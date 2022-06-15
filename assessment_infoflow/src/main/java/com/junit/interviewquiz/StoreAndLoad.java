/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.storeandload.Load;
import com.junit.interviewquiz.storeandload.Store;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rudipurnomo
 */
public class StoreAndLoad {
    
    private static HashMap<String, String>[] a;
    private static String text;

    public void Test(HashMap<String,String>[] arr) {
        
        Store store = new Store();
        text = store.Store(arr);
        System.out.println("Text = "+text);
        
        Load load = new Load();
        a = load.Load(text);
        System.out.println("Array a = "+Arrays.toString(a));

    }
  
}
