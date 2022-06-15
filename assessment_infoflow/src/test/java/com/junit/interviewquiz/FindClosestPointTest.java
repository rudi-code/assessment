/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.findnclosepoint.Point;
import com.junit.interviewquiz.findnclosepoint.Position;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author user
 */
public class FindClosestPointTest {

    @Test
    public void FindClosest() {
        
        Point pointA = new Point();
        pointA.setX(2);
        pointA.setY(3);
        
        Point pointB = new Point();
        pointB.setX(4);
        pointB.setY(5);
        
        Point pointC = new Point();
        pointC.setX(7);
        pointC.setY(2);
        
        List<Point> listPoint = new ArrayList<Point>();
        listPoint.add(pointA);
        listPoint.add(pointB);
        listPoint.add(pointC);
        
        FindClosestPoint fcp = new FindClosestPoint();
        fcp.Test(listPoint);
    }
    
    
}
