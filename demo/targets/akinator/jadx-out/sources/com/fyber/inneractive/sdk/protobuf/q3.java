package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q3 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f26463a;

    public q3(r3 r3Var) {
        this.f26463a = r3Var.f26470a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26463a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f26463a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
