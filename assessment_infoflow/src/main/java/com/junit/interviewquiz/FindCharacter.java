/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.findcharacter.AllCharacter;
import com.junit.interviewquiz.findcharacter.Characters;
import com.junit.interviewquiz.findcharacter.FirstCharacter;
import com.junit.interviewquiz.findcharacter.Text;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FindCharacter {

    public void Test(Text text) {

        System.out.println("All Character ");
        AllCharacter allChar = new AllCharacter(text);
        allChar.getArrayCharacter();
        System.out.println("");
        
        System.out.println("First Character");
        FirstCharacter firstC = new FirstCharacter(text);
        firstC.getArrayCharacter();
        
    }


    
    
    
}
