package com.example.tetris.component;

import android.content.Context;
import android.widget.TextView;

public class GameCell extends TextView {
    private int row;
    private int col;

    public GameCell(Context context, int row, int col) {
        super(context);
        this.col = col;
        this.row = row;
    }

}
