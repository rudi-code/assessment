/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class StoreAndLoadTest {
    
    @Test
    public void testStoreAndLoad() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
     
        HashMap<String, String> mapA = new HashMap<String, String>();
        mapA.put("keyA", "valueA");
        
        List<HashMap<String, String>> listMap = new ArrayList<>();
        listMap.add(map);
        listMap.add(mapA);
        
        HashMap<String,String>[] arr = new HashMap[listMap.size()];
        for (int i = 0; i < listMap.size(); i++) {
            arr[i] = listMap.get(i);
        }
        
        StoreAndLoad sal = new StoreAndLoad();
        sal.Test(arr);
    }
    
}
