/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junit.interviewquiz.findcharacter;

/**
 *
 * @author user
 */
public class Characters {
    
    private char character;
    private int totalCharacter;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getTotalCharacter() {
        return totalCharacter;
    }

    public void setTotalCharacter(int totalCharacter) {
        this.totalCharacter = totalCharacter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.character;
        hash = 31 * hash + this.totalCharacter;
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
        final Characters other = (Characters) obj;
        if (this.character != other.character) {
            return false;
        }
        if (this.totalCharacter != other.totalCharacter) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Characters{" + "character=" + character + ", totalCharacter=" + totalCharacter + '}';
    }
    
}
