/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.optimalpath;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Edges {
    
    private String edgeStart;
    private String edgeFinish;

    public String getEdgeStart() {
        return edgeStart;
    }

    public void setEdgeStart(String edgeStart) {
        this.edgeStart = edgeStart;
    }

    public String getEdgeFinish() {
        return edgeFinish;
    }

    public void setEdgeFinish(String edgeFinish) {
        this.edgeFinish = edgeFinish;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.edgeStart);
        hash = 89 * hash + Objects.hashCode(this.edgeFinish);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Edges other = (Edges) obj;
        if (!Objects.equals(this.edgeStart, other.edgeStart)) {
            return false;
        }
        if (!Objects.equals(this.edgeFinish, other.edgeFinish)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Edges{" + "edgeStart=" + edgeStart + ", edgeFinish=" + edgeFinish + '}';
    }


    

    
 
}
