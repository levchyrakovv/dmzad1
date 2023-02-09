package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int cash = 312;

    private int coat = 70;

    private int coatDiscount = 77;

    private int hat = 25;

    private int hatDiscount = 37;

    private int businessSuit = 53;

    private int businessSuitDiscount = 44;

    private int shirt =19;

    private int shirtDiscount = 0;

    private int shoes =41;

    private int shoesDiscount =32;

    public boolean canBuyComputer() {
        float result;

        result = (coat * coatDiscount +
                hat * hatDiscount + businessSuit * businessSuitDiscount +
                shirt * shirtDiscount +
                shoes * shoesDiscount) / 100;

        result = cash - result;

        if (result < 0) return false;
        else return true;



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt2);

        boolean flag = canBuyComputer();
        if(flag) {
            txt.setText("Мы можем купить деловой гардероб");
        } else {
            txt.setText("Попроси у мамы ещё денег!");
        }

    }
}

