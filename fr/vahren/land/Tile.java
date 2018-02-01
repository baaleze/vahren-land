package fr.vahren.land;

public class Tile {

    public final static int MAX_ALT = 150;

    public Terrain[] terrain;

    public Tile() {
        terrain = new Terrain[MAX_ALT];
    }
    
    public Terrain top() {
        return terrain[terrain.length-1];
    }

    public int altitude() {
        return terrain.length;
    }
}