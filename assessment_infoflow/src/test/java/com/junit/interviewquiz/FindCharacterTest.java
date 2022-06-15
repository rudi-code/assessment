/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.findcharacter.Text;
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
public class FindCharacterTest {

    @Test
    public void testFindCharacter() {
        Text text = new Text();
        text.setText("the sun shine all");
        
        FindCharacter fc = new FindCharacter();
        fc.Test(text);
    }
    
}
