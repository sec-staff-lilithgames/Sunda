package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RequirementsWatcher {
    private static final String TAG = "RequirementsWatcher";
    private final Context context;
    private final Listener listener;
    private CapabilityValidatedCallback networkCallback;
    private DeviceStatusChangeReceiver receiver;
    private final Requirements requirements;
    private boolean requirementsWereMet;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CapabilityValidatedCallback extends ConnectivityManager.NetworkCallback {
        private CapabilityValidatedCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            RequirementsWatcher.logd(RequirementsWatcher.this + " NetworkCallback.onAvailable");
            RequirementsWatcher.this.checkRequirements(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            RequirementsWatcher.logd(RequirementsWatcher.this + " NetworkCallback.onLost");
            RequirementsWatcher.this.checkRequirements(false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.logd(RequirementsWatcher.this + " received " + intent.getAction());
            RequirementsWatcher.this.checkRequirements(false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void requirementsMet(RequirementsWatcher requirementsWatcher);

        void requirementsNotMet(RequirementsWatcher requirementsWatcher);
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
        this.requirements = requirements;
        this.listener = listener;
        this.context = context.getApplicationContext();
        logd(this + " created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements(boolean z10) {
        boolean zCheckRequirements = this.requirements.checkRequirements(this.context);
        if (!z10 && zCheckRequirements == this.requirementsWereMet) {
            logd(o2.n("requirementsAreMet is still ", zCheckRequirements));
            return;
        }
        this.requirementsWereMet = zCheckRequirements;
        if (zCheckRequirements) {
            logd("start job");
            this.listener.requirementsMet(this);
        } else {
            logd("stop job");
            this.listener.requirementsNotMet(this);
        }
    }

    private void registerNetworkCallbackV23() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(16).build();
        CapabilityValidatedCallback capabilityValidatedCallback = new CapabilityValidatedCallback();
        this.networkCallback = capabilityValidatedCallback;
        connectivityManager.registerNetworkCallback(networkRequestBuild, capabilityValidatedCallback);
    }

    private void unregisterNetworkCallback() {
        if (Util.SDK_INT >= 21) {
            ((ConnectivityManager) this.context.getSystemService("connectivity")).unregisterNetworkCallback(this.networkCallback);
            this.networkCallback = null;
        }
    }

    public Requirements getRequirements() {
        return this.requirements;
    }

    public void start() {
        Assertions.checkNotNull(Looper.myLooper());
        checkRequirements(true);
        IntentFilter intentFilter = new IntentFilter();
        if (this.requirements.getRequiredNetworkType() != 0) {
            if (Util.SDK_INT >= 23) {
                registerNetworkCallbackV23();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            if (Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.receiver = deviceStatusChangeReceiver;
        this.context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, new Handler());
        logd(this + " started");
    }

    public void stop() {
        this.context.unregisterReceiver(this.receiver);
        this.receiver = null;
        if (this.networkCallback != null) {
            unregisterNetworkCallback();
        }
        logd(this + " stopped");
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str) {
    }
}
