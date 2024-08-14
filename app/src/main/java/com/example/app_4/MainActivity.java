package com.example.app_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgButtonPic1,imgButtonPic2,imgButtonPic3;
    private ImageView imageViewPic;
    private TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButtonPic1 = (ImageButton) findViewById(R.id.imageButton_pic1);
        imgButtonPic2 = (ImageButton) findViewById(R.id.imageButton_pic2);
        imgButtonPic3 = (ImageButton) findViewById(R.id.imageButton_pic3);

        imageViewPic = (ImageView) findViewById(R.id.imageView_id);
        textViewData = (TextView) findViewById(R.id.textView_data);

        imgButtonPic1.setOnClickListener(new MyButton());
        imgButtonPic2.setOnClickListener(new MyButton());
        imgButtonPic3.setOnClickListener(new MyButton());

    }

    private class MyButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imageButton_pic1:
                    imageViewPic.setImageResource(R.drawable.cat1);
                    textViewData.setText("This is cute cat.");
                    break;

                case R.id.imageButton_pic2:
                    imageViewPic.setImageResource(R.drawable.cat2);
                    textViewData.setText("There are two baby cats.");
                    break;

                case R.id.imageButton_pic3:
                    imageViewPic.setImageResource(R.drawable.cat3);
                    textViewData.setText("This is cute cat.");

            }

        }
    }
}