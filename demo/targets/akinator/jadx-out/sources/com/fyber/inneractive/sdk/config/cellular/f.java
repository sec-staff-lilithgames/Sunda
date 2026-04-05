package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public h f23248a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f23249b;

    public f(ConnectivityManager connectivityManager, h hVar) {
        this.f23248a = hVar;
        this.f23249b = connectivityManager;
    }

    public final void a() {
        this.f23248a = null;
        ConnectivityManager connectivityManager = this.f23249b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th2) {
                IAlog.a("failed to unregister network callback", th2, new Object[0]);
            }
        }
    }

    public final void b() {
        ConnectivityManager connectivityManager = this.f23249b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th2) {
                IAlog.a("failed to register network callback", th2, new Object[0]);
            }
        }
    }

    public final void c() {
        ConnectivityManager connectivityManager = this.f23249b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th2) {
                IAlog.a("failed to unregister network callback", th2, new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCapabilitiesChanged(android.net.Network r3, android.net.NetworkCapabilities r4) {
        /*
            r2 = this;
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.UNKNOWN
            r0 = 3
            boolean r1 = r4.hasTransport(r0)
            if (r1 == 0) goto Lc
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.ETHERNET
            goto L47
        Lc:
            r1 = 0
            boolean r1 = r4.hasTransport(r1)
            if (r1 == 0) goto L3e
            int r4 = com.fyber.inneractive.sdk.util.k.k()
            if (r4 == 0) goto L47
            if (r4 == r0) goto L3b
            r3 = 18
            if (r4 == r3) goto L38
            r3 = 20
            if (r4 == r3) goto L35
            r3 = 5
            if (r4 == r3) goto L3b
            r3 = 6
            if (r4 == r3) goto L3b
            switch(r4) {
                case 8: goto L3b;
                case 9: goto L3b;
                case 10: goto L3b;
                default: goto L2c;
            }
        L2c:
            switch(r4) {
                case 12: goto L3b;
                case 13: goto L32;
                case 14: goto L3b;
                case 15: goto L3b;
                default: goto L2f;
            }
        L2f:
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.CELLULAR
            goto L47
        L32:
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.MOBILE_4G
            goto L47
        L35:
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.MOBILE_5G
            goto L47
        L38:
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.WIFI
            goto L47
        L3b:
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.MOBILE_3G
            goto L47
        L3e:
            r0 = 1
            boolean r4 = r4.hasTransport(r0)
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.util.z0 r3 = com.fyber.inneractive.sdk.util.z0.WIFI
        L47:
            com.fyber.inneractive.sdk.config.cellular.h r4 = r2.f23248a
            if (r4 == 0) goto L4e
            r4.a(r3)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.cellular.f.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }
}
