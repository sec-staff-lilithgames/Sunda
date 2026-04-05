package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f16623a;

    public b0(c0 c0Var) {
        this.f16623a = c0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        j9.s.postOnUiThread(new a0(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        j9.s.postOnUiThread(new a0(this, false));
    }
}
