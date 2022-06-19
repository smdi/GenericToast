package com.aidev.generictoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callToast(this);
    }

    private void callToast(MainActivity mainActivity) {

        View view = LayoutInflater.from(mainActivity)
                .inflate(R.layout.generic_toast_layout, null);

        ImageView genericToastImageType = view.findViewById(R.id.genericToastTypeImage);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.gt_bounce_animation);

        BounceActionAnimation interpolator = new BounceActionAnimation(0.2, 25);
        myAnim.setInterpolator(interpolator);

        genericToastImageType.startAnimation(myAnim);

        Toast toast = new Toast(mainActivity);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();

    }
}