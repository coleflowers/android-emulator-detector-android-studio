package com.a52developer.android_emulator_detector_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.skoumal.emulatordetector.EmulatorDetector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        TextView tv_emulator = (TextView)findViewById(R.id.tv_emulator);
        if (EmulatorDetector.isEmulator()){
            tv_emulator.setText(getString(R.string.emulator_status_yes));
        } else {
            tv_emulator.setText(getString(R.string.emulator_status_no));
        }
    }
}
