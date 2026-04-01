package com.sunda.demo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public final class MainActivity extends Activity {
    private final BroadcastReceiver finishedReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            refreshSummary();
        }
    };

    private TextView summaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summaryView = findViewById(R.id.summaryView);
        Button scanButton = findViewById(R.id.scanButton);
        Button calibrationButton = findViewById(R.id.calibrationButton);

        scanButton.setOnClickListener(view ->
                ScanCoordinator.triggerScan(getApplicationContext(), "activity_button", false, this::refreshSummary));
        calibrationButton.setOnClickListener(view ->
                ScanCoordinator.triggerScan(getApplicationContext(), "activity_calibration", true, this::refreshSummary));
        refreshSummary();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(ScanCoordinator.ACTION_SCAN_FINISHED);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(finishedReceiver, filter, Context.RECEIVER_NOT_EXPORTED);
        } else {
            registerReceiver(finishedReceiver, filter);
        }
    }

    @Override
    protected void onStop() {
        unregisterReceiver(finishedReceiver);
        super.onStop();
    }

    private void refreshSummary() {
        summaryView.setText(ScanCoordinator.loadSummary(this));
    }
}
