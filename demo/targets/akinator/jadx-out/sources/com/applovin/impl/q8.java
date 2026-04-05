package com.applovin.impl;

import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.p2;
import com.applovin.impl.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements p2.a, t0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinCommunicatorSubscriber f15161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15162c;

    public /* synthetic */ q8(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, Object obj) {
        this.f15161b = appLovinCommunicatorSubscriber;
        this.f15162c = obj;
    }

    @Override // com.applovin.impl.p2.a
    public void a(i2 i2Var, o2 o2Var) {
        ((a7) this.f15161b).a((com.applovin.impl.sdk.k) this.f15162c, i2Var, o2Var);
    }

    @Override // com.applovin.impl.t0.c
    public void a(t0.b bVar) {
        ((t0) this.f15161b).a((t0.c) this.f15162c, bVar);
    }
}
