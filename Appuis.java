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
 public abstract class Appuis extends Noeud {

    private double alpha;
    private TriangleTerrain TT;
    private int num;

    
    public abstract boolean verifieHypothese();

 }