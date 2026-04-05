package tu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f87399b;

    /* renamed from: c, reason: collision with root package name */
    public int f87400c;

    public p0(long[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        this.f87399b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87400c < this.f87399b.length;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return o0.m7080boximpl(m7087nextsVKNKU());
    }

    /* renamed from: next-s-VKNKU, reason: not valid java name */
    public long m7087nextsVKNKU() {
        int i10 = this.f87400c;
        long[] jArr = this.f87399b;
        if (i10 >= jArr.length) {
            throw new NoSuchElementException(String.valueOf(this.f87400c));
        }
        this.f87400c = i10 + 1;
        return o0.m7081constructorimpl(jArr[i10]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
