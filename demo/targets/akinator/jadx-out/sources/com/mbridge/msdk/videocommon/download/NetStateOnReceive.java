package com.mbridge.msdk.videocommon.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class NetStateOnReceive extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    b.getInstance().b(false);
                } else if (activeNetworkInfo.getType() == 1) {
                    b.getInstance().a(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    b.getInstance().a();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
