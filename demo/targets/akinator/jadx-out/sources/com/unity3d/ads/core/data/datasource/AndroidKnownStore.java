package com.unity3d.ads.core.data.datasource;

import com.ironsource.C3182dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET(C3182dd.f36288a),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");

    private final String packageName;

    AndroidKnownStore(String str) {
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
