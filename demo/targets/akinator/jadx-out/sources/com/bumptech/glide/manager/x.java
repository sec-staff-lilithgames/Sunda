package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x implements j9.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16656a;

    public x(Context context) {
        this.f16656a = context;
    }

    @Override // j9.j
    public ConnectivityManager get() {
        return (ConnectivityManager) this.f16656a.getSystemService("connectivity");
    }
}
