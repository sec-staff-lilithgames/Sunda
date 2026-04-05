package com.digidust.elokence.akinator.broadcastlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.C3191e4;
import jb.h;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class InstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return;
        }
        for (String str : stringExtra.split(C3191e4.i.f36527c)) {
            if (str != null) {
                String[] strArrSplit = str.split(C3191e4.i.f36525b);
                if (strArrSplit[0].equals("utm_source")) {
                    try {
                        h.sharedInstance().init(context);
                        h.sharedInstance().createOrUpdateMetricValeur("utm_source", strArrSplit[1]);
                        Timber.tag("InstallReferrerReceiver").d("utm_source: " + strArrSplit[1], new Object[0]);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }
}
