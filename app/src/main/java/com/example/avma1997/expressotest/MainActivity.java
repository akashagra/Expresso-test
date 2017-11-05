package com.example.avma1997.expressotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    int price=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView quantityTextView=findViewById(R.id.textView);
        quantityTextView.setText(quantity+"");
        final TextView priceTextView=findViewById(R.id.textView2);
        priceTextView.setText(price+"");
        Button incrementButton=findViewById(R.id.button);
        Button decrementButton=findViewById(R.id.button2);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                quantityTextView.setText(quantity+"");
                price=price+5;
                priceTextView.setText(price+"");


            }
        });
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity>0)
                {
                    quantity--;
                    quantityTextView.setText(quantity+"");

                }
                if(price>0)
                {
                    price=price-5;
                    priceTextView.setText(price+"");
                }
            }
        });


    }
}
