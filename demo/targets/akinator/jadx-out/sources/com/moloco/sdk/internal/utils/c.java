package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.e0;
import kv.p;
import zu.j;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements k {

    /* renamed from: b, reason: collision with root package name */
    public final d f47221b;

    public c(d key) {
        e0.checkNotNullParameter(key, "key");
        this.f47221b = key;
    }

    @Override // zu.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d getKey() {
        return this.f47221b;
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, p pVar) {
        return (R) j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends k> E get(l lVar) {
        return (E) j.get(this, lVar);
    }

    @Override // zu.k, zu.m
    public m minusKey(l lVar) {
        return j.minusKey(this, lVar);
    }

    @Override // zu.k, zu.m
    public m plus(m mVar) {
        return j.plus(this, mVar);
    }
}
