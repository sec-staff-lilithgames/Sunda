package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f26841a;

    public c(i1 i1Var) {
        this.f26841a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("Removing clicked state after timeout", new Object[0]);
        this.f26841a.i();
    }
}
