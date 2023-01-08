package com.saiful_islam.animationwithmyimage_assignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Button btnFadeIn, btnFadeOut,btnBounce;
    Animation animFadeIn,animFadeOut,animBounce;
    ImageView imgViewAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        btnBounce = findViewById(R.id.btnBounce);

        imgViewAnim = findViewById(R.id.imgVwAnim);


        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);

        // fade in
        btnFadeIn.setOnClickListener(view -> {
            imgViewAnim.setVisibility(View.VISIBLE);
            imgViewAnim.startAnimation(animFadeIn);
        });

        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        // fade out
        btnFadeOut.setOnClickListener(view -> {
            imgViewAnim.setVisibility(View.VISIBLE);
            imgViewAnim.startAnimation(animFadeOut);
        });


        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        // Bounce
        btnBounce.setOnClickListener(view -> imgViewAnim.startAnimation(animBounce));


    }
}
