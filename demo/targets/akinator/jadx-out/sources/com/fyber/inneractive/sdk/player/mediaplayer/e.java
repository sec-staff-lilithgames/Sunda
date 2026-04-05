package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolder f26189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26190b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.f26190b = pVar;
        this.f26189a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f26190b, this.f26189a);
    }
}
