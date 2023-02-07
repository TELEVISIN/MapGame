package game.gui;

import game.map.MapSetup;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameWindow {

    public GameWindow() {
        JFrame gameWindow = new JFrame("MapGame");
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gameWindow.setJMenuBar(createGameMenuBar());

        JLabel provinceLabel = new JLabel(new ImageIcon("src/main/resources/mapdata/provincemap.png"));

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
}
