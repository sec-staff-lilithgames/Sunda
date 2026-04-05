package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.q8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2954q8 implements Iterator, lv.c {

    /* renamed from: a, reason: collision with root package name */
    public int f33282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2970r8 f33283b;

    public C2954q8(C2970r8 c2970r8) {
        this.f33283b = c2970r8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33282a < this.f33283b.B;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            ArrayList arrayList = this.f33283b.A;
            int i10 = this.f33282a;
            this.f33282a = i10 + 1;
            C2903n8 c2903n8 = (C2903n8) arrayList.get(i10);
            kotlin.jvm.internal.e0.checkNotNull(c2903n8);
            return c2903n8;
        } catch (IndexOutOfBoundsException e10) {
            this.f33282a--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
