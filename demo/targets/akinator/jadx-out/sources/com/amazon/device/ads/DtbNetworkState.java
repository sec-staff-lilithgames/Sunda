package com.amazon.device.ads;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbNetworkState {
    public static final DtbNetworkState INSTANCE = new DtbNetworkState();
    public final ConnectivityManager connectivityManager = (ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity");

    public boolean isWifiConnection() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getTypeName().equals("WIFI");
    }
}
