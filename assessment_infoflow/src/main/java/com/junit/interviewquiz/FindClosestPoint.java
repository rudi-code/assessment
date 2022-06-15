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

/**
 *
 * @author user
 */
public class FindClosestPoint {
    
    public void Test(List<Point> listPoint) {

        Position position = new Position(listPoint);
        position.getClosest();
    }
    
    
}
