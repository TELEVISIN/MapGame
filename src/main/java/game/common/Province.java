package game.common;

public class Province {
    private int id;
    private int rgb;
    private Terrain terrainType;
    private String name;

    public Province(int id, Terrain terrainType, int rgb) {
        this.id = id;
        this.terrainType = terrainType;
        this.rgb = rgb;
    }

    public int getId() {
        return id;
    }

    public Terrain getTerrainType() {
        return terrainType;
    }

    public int getRgb() {
        return rgb;
    }
}
