package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x2 extends d3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f26534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(e3 e3Var) {
        super(e3Var);
        this.f26534b = e3Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new w2(this.f26534b);
    }
}
