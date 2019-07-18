package com.example.tetris;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tetris.adapter.GridViewAdapter;
import com.example.tetris.cube.Cube;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private final int[][] coordinate = new int[20][10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View rotate = findViewById(R.id.rotate);
        View left = findViewById(R.id.left);
        View right = findViewById(R.id.right);
        View down = findViewById(R.id.down);

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        final View[] buttonViews = {rotate, left, right, down};
        final Switch showButtons = findViewById(R.id.showButtons);
        showButtons.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    for (View buttonView : buttonViews) {
                        buttonView.setAlpha(0.35f);
                    }
                } else {
                    for (View buttonView : buttonViews) {
                        buttonView.setAlpha(0);
                    }
                }
            }
        });

        initGameInterface();
    }

    private void initGameInterface() {
        int[] tCube = Cube.T;
        for (int position : tCube) {
            System.out.println(R.drawable.blue_cube);
            System.out.println(Integer.MAX_VALUE);
            coordinate[position / 10][position % 10] = R.drawable.blue_cube;
        }

        System.out.println(Arrays.toString(coordinate[0]));
        System.out.println(Arrays.toString(coordinate[1]));

        GridView gameView = findViewById(R.id.tetrisView);
        GridViewAdapter adapter = new GridViewAdapter(MainActivity.this, coordinate);
        gameView.setAdapter(adapter);
    }
}
