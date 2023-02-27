package game;

import game.gui.GameWindow;
import game.map.MapSetup;
import game.map.Provincegenerator;

import java.io.IOException;

public class MapGame {
    public static void main(String[] args) throws IOException {
        GameWindow gameWindow = new GameWindow();
        Provincegenerator provinceGenerator = new Provincegenerator();
        MapSetup mapSetup = new MapSetup(provinceGenerator.getProvinces());
    }
}
