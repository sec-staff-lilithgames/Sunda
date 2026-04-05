package com.explorestack.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class lc implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f22361b;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22361b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public String next() {
        return (String) this.f22361b.next();
    }
}
