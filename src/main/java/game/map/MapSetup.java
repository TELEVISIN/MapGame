package game.map;

import game.common.Province;
import game.common.Terrain;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapSetup {
    public MapSetup() throws IOException {
        BufferedImage provincemap = ImageIO.read(new File("src/main/resources/mapdata/provincemap.png"));
        List<Province> provinceList = new ArrayList<>();
        List<Integer> provinceRGBs = new ArrayList<>();

        for (int y = 0; y < provincemap.getHeight(); y++) {
            for (int x = 0; x < provincemap.getWidth(); x++) {
                int pixel = provincemap.getRGB(x, y);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;

                if(!provinceRGBs.contains(provincemap.getRGB(x, y))) {
                    provinceRGBs.add(provincemap.getRGB(x, y));
                }
            }
        }

        for (int i = 0; i < provinceRGBs.size(); i++) {
            provinceList.add(new Province(i, Terrain.PLAINS, provinceRGBs.get(i), 10, 4, 2, 1, 2));
            System.out.println(provinceList.get(i).getId() + ", " +
                    provinceList.get(i).getTerrainType() +
                    ", tax in province: " + provinceList.get(i).getProvinceTax() +
                    ", production in province: " + provinceList.get(i).getProvinceProduction() +
                    ", manpower in province: " + provinceList.get(i).getProvinceManpower() +
                    ", researchPoints in province: " + provinceList.get(i).getProvinceResearchPoints() +
                    ", importRoutes in province: " + provinceList.get(i).getProvinceResearchPoints());
        }
    }
}
