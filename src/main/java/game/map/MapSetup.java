package game.map;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapSetup {

    public MapSetup() throws IOException {
        BufferedImage provincemap = ImageIO.read(new File("src/main/resources/mapdata/provincemap.png"));
        List usedColors = new ArrayList<>();

        for (int y = 0; y < provincemap.getHeight(); y++) {
            for (int x = 0; x < provincemap.getWidth(); x++) {
                int pixel = provincemap.getRGB(x, y);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;

                String provinceRGB = red + ", " + green + ", " + blue;
                usedColors.add(provinceRGB);
                System.out.println(provinceRGB);
            }
        }
    }
}
