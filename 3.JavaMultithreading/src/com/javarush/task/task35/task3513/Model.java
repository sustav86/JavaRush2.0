package task35.task3513;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 03.08.2017.
 */
public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;

    public Model() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        resetGameTiles();
    }

    public List<Tile> getEmptyTiles() {
        List<Tile> listOfEmptyTiles = new ArrayList<>();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                if (gameTiles[i][j].isEmpty()) {
                    listOfEmptyTiles.add(gameTiles[i][j]);
                }
            }
        }

        return listOfEmptyTiles;
    }

    public void addTile() {
        List<Tile> listOfEmptyTiles = getEmptyTiles();
        Tile tile = listOfEmptyTiles.get((int)(Math.random() * listOfEmptyTiles.size()));
        tile.value = (Math.random() < 0.9 ? 2 : 4);

    }

    public void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }
}
