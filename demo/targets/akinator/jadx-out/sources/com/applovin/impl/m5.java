package com.applovin.impl;

import com.applovin.impl.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final a f14449g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(v.a aVar);
    }

    public m5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f14449g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14449g.a(this.f14003a.B().f());
    }
}
