package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.flow.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f23069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f23070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f23071c;

    public t(y yVar, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f23071c = yVar;
        this.f23069a = c0Var;
        this.f23070b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23071c.a(this.f23069a, this.f23070b);
    }
}
