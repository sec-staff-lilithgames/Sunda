package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i1 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f88745b;

    /* renamed from: c, reason: collision with root package name */
    public int f88746c;

    public i1(Iterator<Object> iterator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterator, "iterator");
        this.f88745b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f88745b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final g1 next() {
        int i10 = this.f88746c;
        this.f88746c = i10 + 1;
        if (i10 < 0) {
            p0.throwIndexOverflow();
        }
        return new g1(i10, this.f88745b.next());
    }
}
