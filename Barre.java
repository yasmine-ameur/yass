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
public class Barre {

    private int id;
    private TypeBarre type;
    private Noeud noeud1;
    private Noeud noeud2;
    
    public Barre(int id, TypeBarre type, Noeud n1, Noeud n2) {
        this.id = id;
        this.type = type ;
        this.noeud1 = n1;
        this.noeud2 = n2;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the type
     */
    public TypeBarre getType() {
        return type;
    }

    /**
     * @return the noeud1
     */
    public Noeud getNoeud1() {
        return noeud1;
    }

    /**
     * @return the noeud2
     */
    public Noeud getNoeud2() {
        return noeud2;
    }
    
    

    
    

}
