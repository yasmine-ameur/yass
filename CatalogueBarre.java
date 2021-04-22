/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.ameur.test.projettreillis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasmi
 */
public class CatalogueBarre {

    private List<TypeBarre> catalogue;

    public CatalogueBarre() {
        this.catalogue = new ArrayList<TypeBarre>();
    }

    public List<TypeBarre> getType() {
        return this.catalogue;
    }

    public boolean addType(TypeBarre type) {
        if (this.catalogue.contains(type)) {
            return false;
        } else {
            this.catalogue.add(type);
            return true;
        }
    }

    public void remove(TypeBarre t) {
        if (!this.catalogue.contains(t)) {
            throw new Error("le type de barre n'est pas dans le catalogue");
        }
        this.catalogue.remove(t);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < catalogue.size(); i++) {
            s += catalogue.get(i);
            while (i < catalogue.size() - 1) {
                s += " ; ";
            }
        }
        return s;
    }
}
