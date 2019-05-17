package com.example.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    private FactBook factBook = new FactBook();
    private TextView factTextView;
    private ColorWheel colorWheel = new ColorWheel();
    private Button   showFaceButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.FactView);
        showFaceButton = findViewById(R.id.Factbutton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String fact = factBook.getfact();
                factTextView.setText(fact);

               int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFaceButton.setTextColor(color);
            }
        };
        showFaceButton.setOnClickListener(listener);
       // Toast.makeText(this,"Activaty was Created",Toast.LENGTH_LONG).show();
       Log.d("TAG","Unfortunately,FunFact has stopped.");
    }
}
