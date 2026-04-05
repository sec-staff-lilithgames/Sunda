package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i1 extends AbstractList {

    /* renamed from: a, reason: collision with root package name */
    public final List f26395a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f26396b;

    public i1(List list, h1 h1Var) {
        this.f26395a = list;
        this.f26396b = h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h1 h1Var = this.f26396b;
        Object obj = this.f26395a.get(i10);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        com.fyber.inneractive.sdk.bidder.l0 l0VarA = com.fyber.inneractive.sdk.bidder.l0.a(((Integer) obj).intValue());
        return l0VarA == null ? com.fyber.inneractive.sdk.bidder.l0.UNRECOGNIZED : l0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26395a.size();
    }
}
