/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.storeandload;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Load {
    
    private HashMap<String,String>[] a;

    public HashMap<String,String>[] Load(String text) {
        a = proses(text);
        return a;
    }

    private HashMap<String, String>[] proses(String text) {
        String[] split = text.split("\n");
        HashMap<String,String>[] arr = new HashMap[split.length];
        for (int i = 0; i < split.length; i++) {
            if(split[i].contains(";")){
                Map<String, String> map = new HashMap<String, String>();
                String[] kk = split[i].split(";");
                for (int j = 0; j < kk.length; j++) {
                    int t = kk[i].indexOf("=");
                    map.put(kk[j].substring(0, t), kk[j].substring(t+1));
                }
                arr[i]=(HashMap<String, String>) map;
            }else{
                Map<String, String> map = new HashMap<String, String>();
                int t = split[i].indexOf("=");
                map.put(split[i].substring(0, t), split[i].substring(t+1));
                arr[i]=(HashMap<String, String>) map;
            }
        }
        return arr;
    }
    
    
    
}
