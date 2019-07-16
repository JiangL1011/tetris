package com.example.tetris;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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

    public void initGameInterface(){
        GridView gameView = findViewById(R.id.game);
        
    }

}
