package game.common;

public class Province {
    private int id;
    private int rgb;
    private Terrain terrainType;
    private String name;

    // TODO: 27/02/2023 change pops using message in #general (sent 11:12 27/2/23)
    private int numOfPeasant;
    private int numOfBurgher;
    private int numOfNobility;
    private int numOfClergy;
    private int numOfBureaucrat;

    private int maxBuildings;
    private int numOfBuildings;
    //derivative province values (generated by pops)
    private float provinceTax;
    private float provinceProduction;
    private float provinceResearchPoints;
    private float provinceImportRoutes;
    private float provinceManpower;
    private float provinceSailors;

    public Province(int id, Terrain terrainType, int rgb,
                    int numOfPeasant, int numOfBurgher, int numOfNobility, int numOfClergy, int numOfBureaucrat) {
        this.id = id;
        this.terrainType = terrainType;
        this.rgb = rgb;
        this.numOfPeasant = numOfPeasant;
        this.numOfBureaucrat = numOfBureaucrat;
        this.numOfBurgher = numOfBurgher;
        this.numOfClergy = numOfClergy;
        this.numOfNobility = numOfNobility;

        this.provinceTax = numOfPeasant * 0.02f +
                numOfBurgher * 0.05f +
                numOfClergy * 0.01f +
                numOfNobility * 0.01f +
                numOfBureaucrat * 0.03f;
        this.provinceManpower = numOfNobility * 25 + numOfPeasant * 10;
        this.provinceProduction = numOfPeasant * 0.03f;
        this.provinceImportRoutes = numOfBurgher * 0.1f;
        this.provinceResearchPoints = numOfClergy * 0.01f + numOfBureaucrat * 0.03f;
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
    public float getProvinceTax() {
        return provinceTax;
    }

    public float getProvinceProduction() {
        return provinceProduction;
    }

    public float getProvinceResearchPoints() {
        return provinceResearchPoints;
    }

    public float getProvinceImportRoutes() {
        return provinceImportRoutes;
    }

    public float getProvinceManpower() {
        return provinceManpower;
    }
}
