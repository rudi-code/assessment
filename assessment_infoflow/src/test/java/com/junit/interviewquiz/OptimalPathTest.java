/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.optimalpath.Edges;
import com.junit.interviewquiz.optimalpath.Edges;
import com.junit.interviewquiz.optimalpath.Path;
import com.junit.interviewquiz.optimalpath.Path;
import com.junit.interviewquiz.optimalpath.Vertices;
import com.junit.interviewquiz.optimalpath.Vertices;
import java.util.ArrayList;
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
public class OptimalPathTest {

    @Test
    public void OptimalPath() {
        
        Vertices vA = new Vertices();
        vA.setPoint("A");
        vA.setValue(1);
        
        Vertices vB = new Vertices();
        vB.setPoint("B");
        vB.setValue(2);
        
        Vertices vC = new Vertices();
        vC.setPoint("C");
        vC.setValue(2);

        Edges e1 = new Edges();
        e1.setEdgeStart("A");
        e1.setEdgeFinish("B");
        
        
        Edges e2 = new Edges();
        e2.setEdgeStart("C");
        e2.setEdgeFinish("B");
        
        Edges e3 = new Edges();
        e3.setEdgeStart("A");
        e3.setEdgeFinish("C");
        
        List<Vertices> listV = new ArrayList<Vertices>();
        listV.add(vA);
        listV.add(vB);
        listV.add(vC);

        List<Edges> listE = new ArrayList<Edges>();
        listE.add(e1);
        listE.add(e2);
        listE.add(e3);
        
        OptimalPath op = new OptimalPath();
        op.Test(listV, listE);
    }
    
}
