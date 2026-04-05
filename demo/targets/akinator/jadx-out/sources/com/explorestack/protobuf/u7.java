package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u7 extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    public final List f22718b;

    /* renamed from: c, reason: collision with root package name */
    public final t7 f22719c;

    public u7(List<Object> list, t7 t7Var) {
        this.f22718b = list;
        this.f22719c = t7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f22719c.convert(this.f22718b.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22718b.size();
    }
}
