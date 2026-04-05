package com.fyber.inneractive.sdk.activities;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f23053a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f23053a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23053a.isFinishing()) {
            return;
        }
        this.f23053a.hideNavigationBar();
    }
}
