package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f26426a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f26427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f26428c;

    public l(s sVar) {
        this.f26428c = sVar;
        this.f26427b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26426a < this.f26427b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f26426a;
        if (i10 >= this.f26427b) {
            throw new NoSuchElementException();
        }
        this.f26426a = i10 + 1;
        return Byte.valueOf(this.f26428c.d(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
