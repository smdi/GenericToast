package com.aidev.generictoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callGenericToast(this);
//        callRainbowToast(this);
    }

    private void callGenericToast(MainActivity mainActivity) {
        String mode = GenericToast.LITE;
        int len = GenericToast.LENGTH_SHORT;

        Button success = mainActivity.findViewById(R.id.Success);
        Button error = mainActivity.findViewById(R.id.Error);
        Button warning = mainActivity.findViewById(R.id.Warning);
        Button info = mainActivity.findViewById(R.id.Info);
        Button custom = mainActivity.findViewById(R.id.Custom);
        Button fullRainbow= mainActivity.findViewById(R.id.FullRainbow);
        fullRainbow.setVisibility(View.GONE);

//        success.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Success", "Connection established successfully!",
//                len, GenericToast.SUCCESS, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));
//
//        error.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Error", "Connection establishment failed!",
//                len, GenericToast.ERROR, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));
//
//        warning.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Warning", "Connection has vulnerabilities!",
//                len, GenericToast.WARNING, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));
//
//        info.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Info", "Incoming request detected!",
//                len, GenericToast.INFO, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));
//
//        custom.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Terminate", "Connection terminated successfully!",
//                len, GenericToast.CUSTOM, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));

        success.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Connection established successfully!",
                len, GenericToast.SUCCESS, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));

        error.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Connection establishment failed!",
                len, GenericToast.ERROR, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));

        warning.setOnClickListener(v -> GenericToast.showToast(mainActivity,  "Connection has vulnerabilities!",
                len, GenericToast.WARNING, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));

        info.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Incoming request detected!",
                len, GenericToast.INFO, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));

        custom.setOnClickListener(v -> GenericToast.showToast(mainActivity, "Connection terminated successfully!",
                len, GenericToast.CUSTOM, mode, GenericToast.DEFAULT_FONT, GenericToast.DEFAULT_FONT));
    }
}