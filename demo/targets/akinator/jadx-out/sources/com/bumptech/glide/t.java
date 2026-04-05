package com.bumptech.glide;

import com.bumptech.glide.manager.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t implements com.bumptech.glide.manager.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f16665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f16666b;

    public t(u uVar, w wVar) {
        this.f16666b = uVar;
        this.f16665a = wVar;
    }

    @Override // com.bumptech.glide.manager.b
    public void onConnectivityChanged(boolean z10) {
        if (z10) {
            synchronized (this.f16666b) {
                this.f16665a.restartRequests();
            }
        }
    }
}
