/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.findnclosepoint;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Distance {
    
    private Point point;
    private double distance;

    public Distance(Point point) {
        this.point = point;
    }

    public double getDistance() {
        distance = Math.sqrt((point.getX()*point.getX())+(point.getY()*point.getY()));
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.point);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.distance) ^ (Double.doubleToLongBits(this.distance) >>> 32));
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
        final Distance other = (Distance) obj;
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(other.distance)) {
            return false;
        }
        if (!Objects.equals(this.point, other.point)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Distance{" + "point=" + point + ", distance=" + distance + '}';
    }
    
    
}
