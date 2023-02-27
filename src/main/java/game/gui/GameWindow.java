package game.gui;

import javax.swing.*;

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
