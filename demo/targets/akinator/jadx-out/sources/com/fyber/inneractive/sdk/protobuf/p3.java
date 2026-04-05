package com.fyber.inneractive.sdk.protobuf;

import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p3 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f26455a;

    public p3(r3 r3Var, int i10) {
        this.f26455a = r3Var.f26470a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26455a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26455a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f26455a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26455a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f26455a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26455a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
