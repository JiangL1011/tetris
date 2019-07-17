package com.example.tetris;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tetris.component.GameCell;

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

    public void initGameInterface() {
        GridLayout gameView = findViewById(R.id.game);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                GridLayout.Spec rowSpec = GridLayout.spec(i, 1f);
                GridLayout.Spec colSpec = GridLayout.spec(j, 1f);
                GameCell cell = new GameCell(this, i, j);
                //取控件当前的布局参数
                GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                //使设置好的布局参数应用到控件
                cell.setLayoutParams(params);

                GradientDrawable drawable = new GradientDrawable();
                drawable.setStroke(2, Color.parseColor("#51E2F5"));
                drawable.setColor(Color.parseColor("#51E2F5"));

                cell.setBackground(drawable);

                gameView.addView(cell);
            }
        }
    }

}
