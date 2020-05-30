package com.dune.game.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class BattleMap {
   public static final int COLUMNS_COUNT = 16;
    public static final int  ROWS_COUNT = 9;
    public static final int CELL_SIZE = 80;

    private TextureRegion grassTexture;
    private TextureRegion spiceTexture;
    private int [][] data;

    public BattleMap() {
        this.grassTexture = Assets.getInstance().getAtlas().findRegion("grass");
        this.spiceTexture = Assets.getInstance().getAtlas().findRegion("Spic");
        this.data = new int [COLUMNS_COUNT][ROWS_COUNT];
        for (int i = 0; i < COLUMNS_COUNT; i++){
            for (int j = 0; j < ROWS_COUNT; j++){
                if(MathUtils.random() < 0.1f){
                    data [i][j] = 1;
                }
            }
        }
    }

    public boolean checkPickSpic(Tank harvester){
        if (data[harvester.getCellX()][harvester.getCellY()] == 1) {
            data[harvester.getCellX()][harvester.getCellY()] = 0;
            return true;
        }
        return false;
    }

    public void render(SpriteBatch batch) {
        for (int i = 0; i < COLUMNS_COUNT; i++) {
            for (int j = 0; j < ROWS_COUNT; j++) {
                batch.draw(grassTexture, i * 80, j * 80);
                if (data [i][j] == 1) {
                    batch.draw(spiceTexture, i * 80, j * 80);
                }
            }
        }
    }
}
