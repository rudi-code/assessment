/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.optimalpath;

import java.util.List;

/**
 *
 * @author user
 */
public class Path {
    
    private List<Vertices> listV;
    private List<Edges> listE;
    private Integer pathMax = 0;
    private List<String> containerPath;
    private String fixPath;

    public Path(List<Vertices> listV, List<Edges> listE) {
        this.listV = listV;
        this.listE = listE;  
        lookingForPath();
    }

    private void lookingForPath() {
        for(Edges e : listE){
            for (Edges ed : listE) {
                String path = "";
                if(e.getEdgeFinish().equals(ed.getEdgeStart())){
                    path = e.getEdgeStart().concat(e.getEdgeFinish()).concat(ed.getEdgeFinish());
                    checkPath(path);
                }  
            }
        }
    }
    
    private void checkPath(String path){
        String newPath = "";
        if(path != ""){
            for(Edges e : listE){
                if(path.substring(path.length()-1, path.length()).equals(e.getEdgeStart()) && 
                        !path.contains(e.getEdgeFinish())){
                    newPath += path.concat(e.getEdgeFinish());
                    checkPath(newPath);
                }else{
                    newPath = path;
                }
            }
            for(Vertices v : listV){
                if(newPath.contains(v.getPoint()))
                    System.out.println("");
                    pathMax += v.getValue();
            }
            System.out.println("path : "+path);
            System.out.println("optimal path : "+pathMax);
        }
        
    }   
    
}
