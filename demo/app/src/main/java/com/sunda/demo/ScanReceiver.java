package com.sunda.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class ScanReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !ScanCoordinator.ACTION_SCAN.equals(intent.getAction())) {
            return;
        }

        PendingResult pendingResult = goAsync();
        String reason = intent.getStringExtra(ScanCoordinator.EXTRA_REASON);
        boolean calibrate = intent.getBooleanExtra(ScanCoordinator.EXTRA_CALIBRATE, false);
        ScanCoordinator.triggerScan(context, reason, calibrate, pendingResult::finish);
    }
}
