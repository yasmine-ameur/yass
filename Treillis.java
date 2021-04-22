/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.ameur.test.projettreillis;

import java.util.*;
import javafx.scene.canvas.GraphicsContext;
/**
 *
 */
public class Treillis extends Figure {

    private Terrain Terrain;
    private Groupe ensemble;

    public Treillis(Terrain t, Groupe e) {
        Terrain = t;
        ensemble = e;
    }

    public double maxX() {
        return ensemble.maxX();
    }

    public double minX() {
        return ensemble.minX();
    }

    public double maxY() {
        return ensemble.maxY();
    }

    public double minY() {
        return ensemble.minY();
    }

    public double distancePoint(Point p) {
        return ensemble.distancePoint(p);
    }

    public void draw(GraphicsContext gc) {
        ensemble.draw(gc);
    }

}
