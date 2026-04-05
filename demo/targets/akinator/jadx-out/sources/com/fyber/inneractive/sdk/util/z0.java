package com.fyber.inneractive.sdk.util;

import com.ironsource.C3119a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum z0 {
    UNKNOWN(""),
    ETHERNET(C3119a4.f35921a),
    WIFI(C3119a4.f35922b),
    MOBILE_3G(C3119a4.f35921a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    final String key;

    z0(String str) {
        this.key = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.util.z0 a() {
        /*
            android.app.Application r0 = com.fyber.inneractive.sdk.util.o.f26796a     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L1d
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.o.a(r1)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1d
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1d
            int r0 = r0.getType()     // Catch: java.lang.Exception -> L1d
            goto L1f
        L1d:
            r0 = 8
        L1f:
            r1 = 9
            if (r0 == r1) goto L85
            r1 = 5
            r2 = 3
            if (r0 == 0) goto L3a
            r3 = 1
            if (r0 == r3) goto L37
            r3 = 2
            if (r0 == r3) goto L3a
            if (r0 == r2) goto L3a
            r3 = 4
            if (r0 == r3) goto L3a
            if (r0 == r1) goto L3a
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.UNKNOWN
            return r0
        L37:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.WIFI
            return r0
        L3a:
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.cellular.a r0 = r0.N
            if (r0 == 0) goto L47
            com.fyber.inneractive.sdk.config.cellular.d r3 = r0.f23238a
            if (r3 == 0) goto L47
            com.fyber.inneractive.sdk.util.z0 r0 = r0.f23239b
            goto L73
        L47:
            int r0 = com.fyber.inneractive.sdk.util.k.k()
            if (r0 == 0) goto L71
            if (r0 == r2) goto L6e
            r2 = 18
            if (r0 == r2) goto L6b
            r2 = 20
            if (r0 == r2) goto L68
            if (r0 == r1) goto L6e
            r1 = 6
            if (r0 == r1) goto L6e
            switch(r0) {
                case 8: goto L6e;
                case 9: goto L6e;
                case 10: goto L6e;
                default: goto L5f;
            }
        L5f:
            switch(r0) {
                case 12: goto L6e;
                case 13: goto L65;
                case 14: goto L6e;
                case 15: goto L6e;
                default: goto L62;
            }
        L62:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.CELLULAR
            goto L73
        L65:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.MOBILE_4G
            goto L73
        L68:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.MOBILE_5G
            goto L73
        L6b:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.WIFI
            goto L73
        L6e:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.MOBILE_3G
            goto L73
        L71:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.UNKNOWN
        L73:
            com.fyber.inneractive.sdk.util.z0 r1 = com.fyber.inneractive.sdk.util.z0.UNKNOWN
            if (r0 != r1) goto L84
            int r0 = com.fyber.inneractive.sdk.util.k.k()
            r1 = 13
            if (r0 != r1) goto L82
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.MOBILE_4G
            goto L84
        L82:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.MOBILE_3G
        L84:
            return r0
        L85:
            com.fyber.inneractive.sdk.util.z0 r0 = com.fyber.inneractive.sdk.util.z0.ETHERNET
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.z0.a():com.fyber.inneractive.sdk.util.z0");
    }

    public final String b() {
        return this.key;
    }
}
