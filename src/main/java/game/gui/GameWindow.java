package game.gui;

import game.common.Province;
import game.map.Provincegenerator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameWindow {
    List<Province> provinceList = new ArrayList<>();
    Provincegenerator provincegenerator = new Provincegenerator(provinceList);
    public GameWindow() throws IOException {
        JFrame gameWindow = new JFrame("MapGame");
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gameWindow.setJMenuBar(createGameMenuBar());

        JLabel provinceLabel = new JLabel(new ImageIcon("src/main/resources/mapdata/provincemap.png"));
        BufferedImage provincemap = ImageIO.read(new File("src/main/resources/mapdata/provincemap.png"));


        provinceLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                int pixel = provincemap.getRGB(x, y);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;

                Province currentProvince = findByRGB(red, green, blue);
                System.out.println(currentProvince.getId() + " - " + currentProvince.getName() + ": " + currentProvince.getTerrainType());
            }
        });

        gameWindow.getContentPane().add(provinceLabel);
        gameWindow.pack();
        gameWindow.setVisible(true);
    }

    private JMenuBar createGameMenuBar() {
        JMenuBar gameMenuBar = new JMenuBar();
        JMenu mapmodeMenu = new JMenu("Mapmodes");
        JMenuItem provinces, owners, cultures, religions;

        provinces = new JMenuItem("Provinces");
        owners = new JMenuItem("Political");
        cultures = new JMenuItem("Culture");
        religions = new JMenuItem("Religion");

        mapmodeMenu.add(provinces);
        mapmodeMenu.add(owners);
        mapmodeMenu.add(cultures);
        mapmodeMenu.add(religions);

        gameMenuBar.add(mapmodeMenu);

        return gameMenuBar;
    }

    public Province findByRGB(int r, int g, int b) {
        return provinceList.stream().filter(
                province -> r == province.getRed() && g == province.getGreen() && b == province.getBlue()
        ).findFirst().orElse(null);
    }
}
