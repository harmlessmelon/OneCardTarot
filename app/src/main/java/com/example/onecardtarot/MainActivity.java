package com.example.onecardtarot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onecardtarot.R;

import java.util.Random;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class MainActivity extends AppCompatActivity {
    final Animation fadeIn = new AlphaAnimation(0.0f, 1.0f);;
    final Animation fadeOut = new AlphaAnimation(1.0f, 0.0f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link all the variables with its id
        final ImageView imageView = (ImageView) findViewById(R.id.image_card);
        Button button = (Button) findViewById(R.id.askButton);

        // create an array to store all the images
        final int a[] = {R.drawable.c_p,
                R.drawable.c_q,
                R.drawable.c1,
                R.drawable.c2,
                R.drawable.c3,
                R.drawable.c4,
                R.drawable.c5,
                R.drawable.c6,
                R.drawable.c7,
                R.drawable.c8,
                R.drawable.c9,
                R.drawable.c10,
                R.drawable.chariot7,
                R.drawable.death13,
                R.drawable.devil15,
                R.drawable.emperor4,
                R.drawable.fool0,
                R.drawable.hanged_man12,
                R.drawable.hermit9,
                R.drawable.hierophant5,
                R.drawable.high_priestess2,
                R.drawable.judgement20,
                R.drawable.justice11,
                R.drawable.lovers6,
                R.drawable.magician1,
                R.drawable.moon18,
                R.drawable.p_kg,
                R.drawable.p_kt,
                R.drawable.p_p,
                R.drawable.p_q,
                R.drawable.p1,
                R.drawable.p2,
                R.drawable.p3,
                R.drawable.p4,
                R.drawable.p5,
                R.drawable.p6,
                R.drawable.p7,
                R.drawable.p8,
                R.drawable.p9,
                R.drawable.p10,
                R.drawable.s_kg,
                R.drawable.s_kt,
                R.drawable.s_p,
                R.drawable.s_q,
                R.drawable.s1,
                R.drawable.s2,
                R.drawable.s3,
                R.drawable.s4,
                R.drawable.s5,
                R.drawable.s6,
                R.drawable.s7,
                R.drawable.s8,
                R.drawable.s9,
                R.drawable.s10,
                R.drawable.star17,
                R.drawable.strength8,
                R.drawable.sun19,
                R.drawable.temperance14,
                R.drawable.tower16,
                R.drawable.w_kg,
                R.drawable.w_kt,
                R.drawable.w_p,
                R.drawable.w1,
                R.drawable.w2,
                R.drawable.w3,
                R.drawable.w4,
                R.drawable.w5,
                R.drawable.w6,
                R.drawable.w7,
                R.drawable.w8,
                R.drawable.w9,
                R.drawable.w10,
                R.drawable.wheel_of_fortune10,
                R.drawable.world21,
                R.drawable.wq,
                R.drawable.empress3,
                R.drawable.c_kg,
                R.drawable.c_kt
        };

        // ask button's onClick function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // generate a number using Random() function
                Random random = new Random();
                int x = random.nextInt(48);

                fadeIn.setDuration(3000);//Random Fortune text fade in speed
                fadeOut.setDuration(6000);//Random Fortune text fade out speed

                imageView.startAnimation(fadeOut);//Fades out previous card
                // set the image to the view
                imageView.setImageResource(a[x]);
                imageView.startAnimation(fadeIn);//Fades in current card

            }
        });
    }
}