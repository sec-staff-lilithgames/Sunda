package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r3 extends AbstractList implements q1, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f26470a;

    public r3(q1 q1Var) {
        this.f26470a = q1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final q1 a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final List b() {
        return this.f26470a.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f26470a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new q3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new p3(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26470a.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final Object a(int i10) {
        return this.f26470a.a(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final void a(s sVar) {
        throw new UnsupportedOperationException();
    }
}
