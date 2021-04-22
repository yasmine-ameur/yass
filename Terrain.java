/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.ameur.test.projettreillis;

/**
 *
 * @author yasmi
 */
import java.util.*;

/**
 *
 */
public class Terrain {

    private double Xmin;
    private double Xmax;
    private double Ymin;
    private double Ymax;

    public Terrain(double Xmin, double Xmax, double Ymin, double Ymax) {
        Xmin = Xmin;
        Xmax = Xmax;
        Ymin = Ymin;
        Ymax = Ymax;
    }


    public double getXmin() {
        return Xmin;
    }

    public double getXmax() {
        return Xmax;
    }

    public double getYmin() {
        return Ymin;
    }

    public double getYmax() {
        return Ymax;
    }
    
    public boolean zoneConstructible (Point p){
        if (p.getPx()<Xmin || p.getPx()>Xmax || p.getPy()<Ymin || p.getPy()> Ymin){
            return false;
        }
        else {
            return true;
        }
    }
    

}
