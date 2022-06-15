/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.findcharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AllCharacter {

    private Text text;
    private Characters character;
    private String textS;
    
    public AllCharacter(Text text) {
        this.text = text;
    }

    public void getArrayCharacter() {
        loop(text.getText());
    }
    
    public void loop(String str){
        List<Characters> arrayC = new ArrayList<>();
        if(str.length() > 0){
            char[] ch = str.toCharArray();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                Characters cr = new Characters();
                    for (char c : ch) {
                    if(str.charAt(i) == c)
                        count++;
                    }
                cr.setCharacter(str.charAt(i));
                cr.setTotalCharacter(count);
                if(cr.getCharacter() != ' '){
                    System.out.println(cr.getCharacter()+" "+cr.getTotalCharacter());
                }
                textS = str.replace(str.substring(i, i+1), "");
                break;
            }
            loop(textS);
        }
    }
   
}
