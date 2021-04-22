/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.ameur.test.projettreillis;

import java.util.*;

/**
 *
 */
public class TriangleTerrain {

    private int id;
    private Point p1;
    private Point p2;
    private Point p3;

    public TriangleTerrain(int id, Point p1, Point p2, Point p3) {
    id = id;
    p1 = p1;
    p2 = p2;
    p3 = p3;
    }

    //STi,1 = [P Ti,1, P Ti,2], STi,2 = [P Ti,2, P Ti,3], STi,3 = [P Ti,3, P Ti,1].
    
    Segment ST1 = new Segment (p1,p2);
    Segment ST2 = new Segment (p2,p3);
    Segment ST3 = new Segment (p3,p1);
    
    public int getId() {
        return id;
    }


    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


    public Point getP3() {
        return p3;
    }
    
    /*Un point P est dit colinéaire à un segment de terrain [P Ti,1, P Ti,2] si
angle(
−−−−−−−−→ P Ti,1, P Ti,2,
−−−−−→ P Ti,1, P) = 0 + kπ ; k ∈ N
• Un point P est dit positif par rapport à un segment de terrain [P Ti,1, P Ti,2] si
0(+2kπ) < angle(
−−−−−−−−→ P Ti,1, P Ti,2,
−−−−−→ P Ti,1, P) < π(+2kπ)
• Un point P est dit negatif par rapport à un segment de terrain [P Ti,1, P Ti,2] si
π(+2kπ) < angle(
−−−−−−−−→ P Ti,1, P Ti,2,
−−−−−→ P Ti,1, P) < 2π(+2kπ)
• Un point P est dit dans un triangle terrain si ses rapports avec les segments du triangle sont tous du même
signe. */
    
    

    public static void main(String[] args) {
        Point p = new Point (1,1);
        Point p1 = new Point (1,1);
        Point p2 = new Point (1,1);
        double angle = Math.atan2(p1.getPy() - p2.getPy(), p1.getPx() - p2.getPy()) - Math.atan2(p1.getPy() - p.getPy(), p1.getPx() - p.getPx());
        System.out.println(angle);
    }
}
