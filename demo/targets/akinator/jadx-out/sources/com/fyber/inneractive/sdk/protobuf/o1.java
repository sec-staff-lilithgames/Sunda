package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f26450a;

    public o1(Iterator it) {
        this.f26450a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26450a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f26450a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26450a.remove();
    }
}
