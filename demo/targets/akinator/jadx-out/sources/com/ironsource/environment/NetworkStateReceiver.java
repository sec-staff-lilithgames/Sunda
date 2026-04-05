package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C3422r4;
import com.ironsource.Dc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private ConnectivityManager f36640a;

    /* renamed from: b, reason: collision with root package name */
    private Dc f36641b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36642c = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Dc dc2 = networkStateReceiver.f36641b;
            if (dc2 != null) {
                dc2.a(networkStateReceiver.f36642c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Dc dc2) {
        this.f36641b = dc2;
        if (context != null) {
            this.f36640a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z10 = this.f36642c;
        ConnectivityManager connectivityManager = this.f36640a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f36642c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                this.f36642c = false;
            }
        } else {
            this.f36642c = false;
        }
        return z10 != this.f36642c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }
}
