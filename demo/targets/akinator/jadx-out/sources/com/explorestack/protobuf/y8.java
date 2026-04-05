package com.explorestack.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y8 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final b9 f22922b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f22923c;

    public y8(b9 b9Var, Iterator it) {
        this.f22922b = b9Var;
        this.f22923c = it;
    }

    public boolean equals(Object obj) {
        return this.f22923c.equals(obj);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22923c.hasNext();
    }

    public int hashCode() {
        return this.f22923c.hashCode();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f22923c.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f22922b.ensureMutable();
        this.f22923c.remove();
    }

    public String toString() {
        return this.f22923c.toString();
    }
}
