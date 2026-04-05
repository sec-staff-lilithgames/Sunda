package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j1.o2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Requirements {
    private static final int DEVICE_CHARGING = 16;
    private static final int DEVICE_IDLE = 8;
    public static final int NETWORK_TYPE_ANY = 1;
    private static final int NETWORK_TYPE_MASK = 7;
    public static final int NETWORK_TYPE_METERED = 4;
    public static final int NETWORK_TYPE_NONE = 0;
    public static final int NETWORK_TYPE_NOT_ROAMING = 3;
    private static final String[] NETWORK_TYPE_STRINGS = null;
    public static final int NETWORK_TYPE_UNMETERED = 2;
    private static final String TAG = "Requirements";
    private final int requirements;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    public Requirements(int i10, boolean z10, boolean z11) {
        this(i10 | (z10 ? 16 : 0) | (z11 ? 8 : 0));
    }

    private boolean checkChargingRequirement(Context context) {
        if (!isChargingRequired()) {
            return true;
        }
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean checkIdleRequirement(Context context) {
        if (!isIdleRequired()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i10 = Util.SDK_INT;
        if (i10 >= 23) {
            if (powerManager.isDeviceIdleMode()) {
                return false;
            }
        } else if (i10 >= 20) {
            if (powerManager.isInteractive()) {
                return false;
            }
        } else if (powerManager.isScreenOn()) {
            return false;
        }
        return true;
    }

    private static boolean checkInternetConnectivity(ConnectivityManager connectivityManager) {
        if (Util.SDK_INT < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            logd("No active network.");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        boolean z10 = networkCapabilities == null || !networkCapabilities.hasCapability(16);
        logd(o2.n("Network capability validated: ", z10));
        return !z10;
    }

    private boolean checkNetworkRequirements(Context context) {
        int requiredNetworkType = getRequiredNetworkType();
        if (requiredNetworkType == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            logd("No network info or no connection.");
            return false;
        }
        if (!checkInternetConnectivity(connectivityManager)) {
            return false;
        }
        if (requiredNetworkType == 1) {
            return true;
        }
        if (requiredNetworkType == 3) {
            boolean zIsRoaming = activeNetworkInfo.isRoaming();
            logd(o2.n("Roaming: ", zIsRoaming));
            return !zIsRoaming;
        }
        boolean zIsActiveNetworkMetered = isActiveNetworkMetered(connectivityManager, activeNetworkInfo);
        logd(o2.n("Metered network: ", zIsActiveNetworkMetered));
        if (requiredNetworkType == 2) {
            return !zIsActiveNetworkMetered;
        }
        if (requiredNetworkType == 4) {
            return zIsActiveNetworkMetered;
        }
        throw new IllegalStateException();
    }

    private static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (Util.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    public boolean checkRequirements(Context context) {
        return checkNetworkRequirements(context) && checkChargingRequirement(context) && checkIdleRequirement(context);
    }

    public int getRequiredNetworkType() {
        return this.requirements & 7;
    }

    public int getRequirementsData() {
        return this.requirements;
    }

    public boolean isChargingRequired() {
        return (this.requirements & 16) != 0;
    }

    public boolean isIdleRequired() {
        return (this.requirements & 8) != 0;
    }

    public String toString() {
        return super.toString();
    }

    public Requirements(int i10) {
        this.requirements = i10;
    }

    private static void logd(String str) {
    }
}
