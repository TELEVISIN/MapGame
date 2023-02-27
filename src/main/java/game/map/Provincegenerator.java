package game.map;

import game.common.Province;
import game.common.Terrain;

public class Provincegenerator {
    private Province[] provinces = {
            new Province(0, Terrain.WASTELAND, 0, 0, 0, 0 ,0 ,0 ,0 ,0),
            new Province(1, Terrain.PLAINS, 255, 0 ,0, 12, 7, 4, 2, 3),
            new Province(2, Terrain.HILLS, 255, 255, 0, 8, 2, 2,1,0),
            new Province(3, Terrain.FARMLAND, 235, 185, 175, 9, 2, 4, 3, 1),
            new Province(4, Terrain.MOUNTAINS, 255, 89, 119, 4, 1, 1, 1, 0),
            new Province(5, Terrain.PLAINS, 104, 47, 0, 8, 3, 3, 2, 2),
            new Province(6, Terrain.MOUNTAINS, 0, 91, 9, 3, 1, 1, 1, 0),
            new Province(7, Terrain.HILLS, 80, 63, 127, 7, 2, 1, 2, 1)
    };

    public Province[] getProvinces() {
        return provinces;
    }
}
