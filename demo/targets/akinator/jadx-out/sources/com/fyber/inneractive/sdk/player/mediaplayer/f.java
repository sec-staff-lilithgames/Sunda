package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f26191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26192b;

    public f(p pVar, Surface surface) {
        this.f26192b = pVar;
        this.f26191a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f26192b, this.f26191a);
    }
}
