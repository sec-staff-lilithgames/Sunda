package com.explorestack.protobuf;

import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class kc implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public ListIterator f22320b;

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f22320b.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f22320b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f22320b.nextIndex();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f22320b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public String next() {
        return (String) this.f22320b.next();
    }

    @Override // java.util.ListIterator
    public String previous() {
        return (String) this.f22320b.previous();
    }

    @Override // java.util.ListIterator
    public void set(String str) {
        throw new UnsupportedOperationException();
    }
}
