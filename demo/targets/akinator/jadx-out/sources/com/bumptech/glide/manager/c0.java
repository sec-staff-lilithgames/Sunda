package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16624a;

    /* renamed from: b, reason: collision with root package name */
    public final y f16625b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.j f16626c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f16627d = new b0(this);

    public c0(j9.j jVar, y yVar) {
        this.f16626c = jVar;
        this.f16625b = yVar;
    }

    @Override // com.bumptech.glide.manager.z
    public boolean register() {
        j9.j jVar = this.f16626c;
        this.f16624a = ((ConnectivityManager) jVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) jVar.get()).registerDefaultNetworkCallback(this.f16627d);
            return true;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e10);
            }
            return false;
        }
    }

    @Override // com.bumptech.glide.manager.z
    public void unregister() {
        ((ConnectivityManager) this.f16626c.get()).unregisterNetworkCallback(this.f16627d);
    }
}
