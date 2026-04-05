package com.unity3d.scar.adapter.common;

import android.app.Activity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f50729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f50730c;

    public k(l lVar, Activity activity) {
        this.f50730c = lVar;
        this.f50729b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f50730c.f50733c.show(this.f50729b);
    }
}
