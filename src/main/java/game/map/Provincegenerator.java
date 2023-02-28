package game.map;

import game.common.Province;
import game.common.Terrain;

import java.util.ArrayList;
import java.util.List;

public class Provincegenerator {
    private List<Province> provinceList = new ArrayList<>();

    public Provincegenerator(List<Province> provinceList) {
        this.provinceList = provinceList;

        provinceList.add(new Province(0, "wasteland", Terrain.WASTELAND, 0, 0, 0, 0 ,0 ,0 ,0 ,0));
        provinceList.add(new Province(1, "Gand", Terrain.PLAINS, 255, 0 ,0, 12, 7, 4, 2, 3));
        provinceList.add(new Province(2, "Evenmoor", Terrain.HILLS, 255, 255, 0, 8, 2, 2,1,0));
        provinceList.add(new Province(3, "Sevran", Terrain.FARMLAND, 235, 185, 175, 9, 2, 4, 3, 1));
        provinceList.add(new Province(4, "Gushbur", Terrain.MOUNTAINS, 255, 89, 119, 4, 1, 1, 1, 0));
        provinceList.add(new Province(5, "Enrin", Terrain.PLAINS, 104, 47, 0, 8, 3, 3, 2, 2));
        provinceList.add(new Province(6, "Lendror", Terrain.MOUNTAINS, 0, 91, 9, 3, 1, 1, 1, 0));
        provinceList.add(new Province(7, "Lenington", Terrain.HILLS, 80, 63, 127, 7, 2, 1, 2, 1));
    }

    public List<Province> getProvinceList() {
        return provinceList;
    }
}
