package com.example.tetris;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tetris.adapter.GameCellAdapter;

import static com.example.tetris.util.MeasureUtil.dip2px;

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
                View view = new View(this);
                view.setBackgroundColor(Color.parseColor("#6495ED"));
                view.setPadding(2, 2, 2, 2);
                //取控件当前的布局参数
                GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                //使设置好的布局参数应用到控件
                view.setLayoutParams(params);
                gameView.addView(view);
            }
        }
    }

}
