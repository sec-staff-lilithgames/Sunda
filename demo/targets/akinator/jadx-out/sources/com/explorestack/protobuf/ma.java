package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ma extends AbstractList implements List {

    /* renamed from: b, reason: collision with root package name */
    public final pa f22377b;

    public ma(pa paVar) {
        this.f22377b = paVar;
    }

    public final void c() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22377b.getCount();
    }

    @Override // java.util.AbstractList, java.util.List
    public AbstractMessage.Builder get(int i10) {
        return this.f22377b.getBuilder(i10);
    }
}
