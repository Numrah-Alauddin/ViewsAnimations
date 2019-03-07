package com.example.viewsanimations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView textView;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.image);
        textView=findViewById(R.id.app_name);
        start=findViewById(R.id.start);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
        Animation animation_translate= AnimationUtils.loadAnimation(this,R.anim.textview_anim);
        Animation animation_scale= AnimationUtils.loadAnimation(this,R.anim.textview_scale);
        Animation animation_rotate= AnimationUtils.loadAnimation(this,R.anim.btn_rotate);

        img.startAnimation(animation);
        textView.startAnimation(animation_scale);
        start.startAnimation(animation_rotate);

        animation_translate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



    }
}
