package com.example.funfact;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private  String colors[] ={

            "#FFBD33",
            "#DBFF33",
            "#33FFBD",
            "#FF5733",
            "#33FF57",
            "#33C4FF",
            "#6B33FF",
            "#FF33C7",
            "#FF3374",
            "#FF33D7",
            "#FF420E",
            "#80BD9E",
            "#F98866",
            "#89DA59",
            "#90AFC5",
            "#763626",
            "#68829E",
            "#AEBD38",
            "#66A5AD",
            "#A2C523",
            "#33FFAC"
    };
    public int getColor(){

        Random random = new Random();
        int num = random.nextInt(colors.length);
        int color = Color.parseColor(colors[num]);

        return color;

    }
}
