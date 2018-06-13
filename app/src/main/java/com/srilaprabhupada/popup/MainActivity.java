package com.srilaprabhupada.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    CardView cardView, cardView1;
    Point p;
    LinearLayout dropDownMenuIconItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardView);
        cardView1 = findViewById(R.id.cardView1);
        dropDownMenuIconItem = findViewById(R.id.vertical_dropdown_icon_menu_items);

    }

    public void verticalDropDownIconMenu(View view) {
        if (dropDownMenuIconItem.getVisibility() == View.VISIBLE) {
            dropDownMenuIconItem.setVisibility(View.INVISIBLE);
        } else {
            dropDownMenuIconItem.setVisibility(View.VISIBLE);
        }
    }

    public void menuItemClick(View view) {
        dropDownMenuIconItem.setVisibility(View.INVISIBLE);
    }
}
