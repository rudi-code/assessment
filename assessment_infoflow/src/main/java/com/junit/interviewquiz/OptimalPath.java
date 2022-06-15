/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz;

import com.junit.interviewquiz.optimalpath.Edges;
import com.junit.interviewquiz.optimalpath.Path;
import com.junit.interviewquiz.optimalpath.Vertices;
import com.sun.javafx.geom.Edge;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rudipurnomo
 */
public class OptimalPath {

    public void Test(List<Vertices> listV, List<Edges> listE) {
        Path fp = new Path(listV, listE);
    }
}
