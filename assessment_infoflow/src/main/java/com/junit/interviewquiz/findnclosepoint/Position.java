/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.findnclosepoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Position {
    
    private List<Point> listPoint;
    private double closest;
    private double farthest;
    private String point;

    public Position(List<Point> listPoint) {
        this.listPoint = listPoint;
    }

    public double getClosest() {
        List<Distance> listDistance = getListDistance(listPoint);
        closest = listDistance.get(0).getDistance();
        for (Distance d : listDistance) {
            if(closest > d.getDistance()){
                closest = d.getDistance();
            }
        }
        for(Point p : listPoint){
            Distance d =new Distance(p);
            d.getDistance();
            if(closest == d.getDistance()){
                point = "titik terdekat (x,y) ialah (" +p.getX()+","+p.getY()+")";
            }      
        }
        System.out.println(point);
        return closest;
    }

    public void setClosest(double closest) {
        this.closest = closest;
    }

    public double getFarthest() {
        List<Distance> listDistance = getListDistance(listPoint);;
        farthest = listDistance.get(1).getDistance();
        for (Distance d : listDistance) {
            if(farthest < d.getDistance()){
                farthest = d.getDistance();
            }
        }
        for(Point p : listPoint){
            Distance d =new Distance(p);
            d.getDistance();
            if(farthest == d.getDistance()){
                point = "titik terjauh (x,y) ialah (" +p.getX()+","+p.getY()+")";
            }      
        }
        System.out.println(point);
        return farthest;
    }

    public void setFarthest(double farthest) {
        this.farthest = farthest;
    }

    private List<Distance> getListDistance(List<Point> listPoint) {
        List<Distance> listD = new ArrayList<Distance>();
        for(Point p : listPoint){
            Distance d = new Distance(p);
            d.getDistance();
            listD.add(d);
        }
        return listD;
    }
    
}
