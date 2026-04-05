package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ab extends fb {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb f21856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(gb gbVar) {
        super(gbVar);
        this.f21856c = gbVar;
    }

    @Override // com.explorestack.protobuf.fb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new za(this.f21856c);
    }
}
