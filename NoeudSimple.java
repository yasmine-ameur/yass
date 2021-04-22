/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.ameur.test.projettreillis;


import java.util.*;


public class NoeudSimple extends Noeud {

    private double px;
    private double py;
    
    public NoeudSimple(double x, double y) {
        px = x; 
        py = y;
    }

    public double getPx() {
        return px;
    }

    public double getPy() {
        return py;
    }

}
