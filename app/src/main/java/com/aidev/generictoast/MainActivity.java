package com.aidev.generictoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callGenericToast(this);
    }

    private void callGenericToast(MainActivity mainActivity) {

        String Mode = GenericToast.LITE;
        int len = GenericToast.LENGTH_SHORT;

        Button success = mainActivity.findViewById(R.id.Success);
        Button error = mainActivity.findViewById(R.id.Error);
        Button warning = mainActivity.findViewById(R.id.Warning);
        Button info = mainActivity.findViewById(R.id.Info);
        Button custom = mainActivity.findViewById(R.id.Custom);

        success.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Success", "Connection established successfully!",
                len, GenericToast.SUCCESS, Mode, R.font.abeezee_regular, R.font.inter));

        error.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Error", "Connection establishment failed!",
                len, GenericToast.ERROR, Mode, R.font.abeezee_regular, R.font.inter));

        warning.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Warning", "Connection has vulnerabilities!",
                len, GenericToast.WARNING, Mode, R.font.abeezee_regular, R.font.inter));

        info.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Info", "Incoming request detected!",
                len, GenericToast.INFO, Mode, R.font.abeezee_regular, R.font.inter));

        custom.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Terminate", "Connection terminated successfully!",
                len, GenericToast.CUSTOM, Mode, R.font.abeezee_regular, R.font.inter));

    }
}